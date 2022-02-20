package com.sandwiches.programming.sandwichesMaker.service;

import com.sandwiches.programming.sandwichesMaker.dto.CreateSandwich;
import com.sandwiches.programming.sandwichesMaker.dto.SandwichDetailDto;
import com.sandwiches.programming.sandwichesMaker.dto.SandwichDto;
import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import com.sandwiches.programming.sandwichesMaker.exception.SMakerErrorCode;
import com.sandwiches.programming.sandwichesMaker.exception.SMakerException;
import com.sandwiches.programming.sandwichesMaker.repository.SandwichRepository;
import com.sandwiches.programming.sandwichesMaker.type.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SandwichService {
    private final SandwichRepository sandwichRepository;
    /*
    이렇게 하는 것이 @Autowired나 @Inject보다 테스트할 때 용이하다.
    하지만, repository가 여러개일 때 일일이 추가하거나 수정하기 어려우니까,
    injection받아야 하는 레파지토리 변수에 final을 붙이면, @RequiredArgsConstructor로 인해 자동으로 생성자를 만들어 준다.
    (레파지토리 변수 우클릭 > Refactor > DeLombok에서 확인 가능)
    public SandwichService(SandwichRepository sandwichRepository){
        this.sandwichRepository = sandwichRepository;
    }
    */

    // entity 생성
    @Transactional
    public CreateSandwich.Response createSandwich(CreateSandwich.@Valid Request request){
        validateCreateDeveloperRequest(request);

        // 첫번째 주문
        Sandwich sandwich = Sandwich.builder()
                .orderNumber(request.getOrderNumber())
                .sandwichMenu(request.getSandwichMenu())
                .sandwichSize(request.getSandwichSize())
                .sandwichNum(request.getSandwichNum())
                .bread(request.getBread())
                .topping(request.getTopping())
                .cheese(request.getCheese())
                .vegetable(request.getVegetable())
                .sandwichSource(request.getSandwichSource())
                .build();
        sandwichRepository.save(sandwich);

        return CreateSandwich.Response.fromEntity(sandwich);
    }

    private void validateCreateDeveloperRequest(CreateSandwich.Request request) {
        // business validation
        // 샌드위치 사이즈를 잘못 주문했을 때
        if(request.getSandwichSize() != 15 && request.getSandwichSize() != 30 ){
            throw new SMakerException(SMakerErrorCode.SIZE_MISS);
        }
        // 주문할 수 있는 샌드위치 수량을 초과했을 때
        if(request.getSandwichNum() > 5){
            throw new SMakerException(SMakerErrorCode.NUM_OVER);
        }

        Optional<Sandwich> sandwichOrderNumber = sandwichRepository.findByOrderNumber(request.getOrderNumber());
        if(sandwichOrderNumber.isPresent()) throw new SMakerException(SMakerErrorCode.DUPLICATED_ORDER_NUMBER);
    }

    public List<SandwichDto> getAllSandwiches() {
        return sandwichRepository.findAll()
                .stream().map(SandwichDto::fromEntity)
                .collect(Collectors.toList());
    }

    public SandwichDetailDto getSandwichDetail(Integer orderNumber){
        return sandwichRepository.findByOrderNumber(orderNumber)
                .map(SandwichDetailDto::fromEntity).orElseThrow(() -> new SMakerException(SMakerErrorCode.INVALID_REQUEST));

    }
}
