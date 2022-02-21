package com.sandwiches.programming.sandwichesMaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Bread {
    WHITE_BREAD("화이트 빵"),
    WHEAT_BREAD("위트 빵"),
    PARMESANOREGANO_BREAD("파마산오레가노 빵"),
    HEARTY_BREAD("하티 빵"),
    FLAT_BREAD("플랫 빵");

    private final String description;
}
