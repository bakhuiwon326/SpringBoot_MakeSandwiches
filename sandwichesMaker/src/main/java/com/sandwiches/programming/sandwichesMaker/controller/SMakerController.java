package com.sandwiches.programming.sandwichesMaker.controller;

import com.sandwiches.programming.sandwichesMaker.dto.CreateSandwich;
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
    public List<String> getAllSandwiches(){
        log.info("GET/sandwiches HTTP/1.1");
        return Arrays.asList("eggmayo", "turkey", "italianBMT", "BLT");
    }

    @PostMapping("/create-sandwiches")
    public List<String> createSandwich(@Valid @RequestBody CreateSandwich.Request request){
        log.info("request : {}", request);
        sandwichService.createSandwich(request);
        return Collections.singletonList("1");
    }
}
