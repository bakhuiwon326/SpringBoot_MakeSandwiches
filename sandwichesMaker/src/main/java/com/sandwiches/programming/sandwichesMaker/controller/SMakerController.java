package com.sandwiches.programming.sandwichesMaker.controller;

import com.sandwiches.programming.sandwichesMaker.dto.CreateSandwich;
import com.sandwiches.programming.sandwichesMaker.dto.EditSandwich;
import com.sandwiches.programming.sandwichesMaker.dto.SandwichDetailDto;
import com.sandwiches.programming.sandwichesMaker.dto.SandwichDto;
import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import com.sandwiches.programming.sandwichesMaker.service.SandwichService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
@EnableJpaAuditing
@RequiredArgsConstructor
public class SMakerController {

    private final SandwichService sandwichService;

    @GetMapping("/sandwiches")
    public List<SandwichDto> getAllSandwiches(){
        log.info("GET/sandwiches HTTP/1.1");
        return sandwichService.getAllMakingSandwiches();
    }

    @GetMapping("/sandwich/{orderNumber}")
    public SandwichDetailDto getSpecificSandwich(@PathVariable Integer orderNumber){
        log.info("GET /sandwich HTTP/1.1");
        return sandwichService.getSandwichDetail(orderNumber);

    }

    @PostMapping("/create-sandwiches")
    public CreateSandwich.Response createSandwich(@Valid @RequestBody CreateSandwich.Request request){
        log.info("request : {}", request);
        return sandwichService.createSandwich(request);
    }

    @PutMapping("/sandwich/{orderNumber}")
    public SandwichDetailDto editSandwichOrder(@PathVariable Integer orderNumber, @Valid @RequestBody EditSandwich.Request request){
        return sandwichService.editSandwichOrder(orderNumber,request);
    }

    @DeleteMapping("/sandwich/{orderNumber}")
    public SandwichDetailDto deleteSandwichOrder(@PathVariable Integer orderNumber){
        return sandwichService.deleteSandwichOrder(orderNumber);
    }
}
