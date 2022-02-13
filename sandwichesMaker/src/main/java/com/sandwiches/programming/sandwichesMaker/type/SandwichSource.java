package com.sandwiches.programming.sandwichesMaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SandwichSource {
    RANCH("랜치"),
    MAYONNAISE("마요네즈"),
    SWEETONION("스위트어니언"),
    HONEYMUSTARD("허니머스타드"),
    SWEETCHILLI("스위트칠리"),
    HOTCHILLI("핫칠리"),
    SOUTHWESTCHIPOTLE("사우스웨스트"),
    YELLOWMUSTARD("머스타드"),
    HORSERADISH("홀스레디쉬");

    private final String description;
}
