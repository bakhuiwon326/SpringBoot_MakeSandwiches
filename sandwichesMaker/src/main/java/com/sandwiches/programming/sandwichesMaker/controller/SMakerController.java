package com.sandwiches.programming.sandwichesMaker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@EnableJpaAuditing
public class SMakerController {
    @GetMapping("/sandwiches")
    public List<String> getAllSandwiches(){
        log.info("GET/sandwiches HTTP/1.1");
        return Arrays.asList("eggmayo", "turkey", "italianBMT", "BLT");
    }
}
