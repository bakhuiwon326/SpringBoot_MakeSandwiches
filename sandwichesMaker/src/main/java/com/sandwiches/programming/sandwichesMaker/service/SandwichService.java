package com.sandwiches.programming.sandwichesMaker.service;

import com.sandwiches.programming.sandwichesMaker.dto.CreateSandwich;
import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import com.sandwiches.programming.sandwichesMaker.repository.SandwichRepository;
import com.sandwiches.programming.sandwichesMaker.type.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;

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
    public void createSandwich(CreateSandwich.@Valid Request request){
        // 첫번째 주문
        Sandwich sandwich = Sandwich.builder()
                .orderNumber(1)
                .sandwichMenu(SandwichMenu.EGGMAYO_SANDWICH)
                .bread(Bread.FLAT_BREAD)
                .topping(Topping.BACON)
                .cheese(Cheese.AMERICAN_CHEESE)
                .vegetable(Vegetable.OLIVE)
                .sandwichSource(SandwichSource.RANCH)
                .build();
        sandwichRepository.save(sandwich);
    }

}
