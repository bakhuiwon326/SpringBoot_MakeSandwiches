package com.sandwiches.programming.sandwichesMaker.controller;

import com.sandwiches.programming.sandwichesMaker.service.SandwichService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;
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

    @GetMapping("/create-sandwiches")
    public List<String> createSandwich(){
        log.info("GET/create-sandwiches HTTP/1.1");
        sandwichService.createSandwich();
        return Collections.singletonList("1");
    }
}
