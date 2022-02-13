package com.sandwiches.programming.sandwichesMaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Cheese {
    AMERICAN_CHEESE("아메리칸 치즈"),
    SHRED_CHEESE("슈레드 치즈"),
    MOZZARELLA_CHEESE("모짜렐라 치즈");

    private final String description;
}
