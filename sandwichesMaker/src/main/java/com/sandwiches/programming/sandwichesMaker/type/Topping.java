package com.sandwiches.programming.sandwichesMaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Topping {
    NOT("추가 안함"),
    EGGMAYO("에그마요"),
    TURKEYHAM("터키햄"),
    HAM("햄"),
    BACON("베이컨"),
    PEPPERONI("페퍼로니");

    private final String description;
}
