package com.sandwiches.programming.sandwichesMaker.type;


import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public enum Vegetable {
    LETTUCE("양상추"),
    TOMATO("토마토"),
    CUCUMBER("오이"),
    ONION("양파"),
    PICLE("피클"),
    JALAPENO("할라피뇨"),
    OLIVE("올리브");

    private final String description;
}
