package com.sandwiches.programming.sandwichesMaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SandwichMenu {
    EGGMAYO_SANDWICH("에그마요 샌드위치"),
    TURKEY_SANDWICH("터키 샌드위치"),
    BMT_SANDWICH("이탈리안 BMT 샌드위치"),
    BLT_SANDWICH("BLT 샌드위치");

    private final String description;
}
