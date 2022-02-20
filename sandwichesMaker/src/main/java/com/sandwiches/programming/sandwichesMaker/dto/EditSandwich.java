package com.sandwiches.programming.sandwichesMaker.dto;

import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import com.sandwiches.programming.sandwichesMaker.type.*;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

// 샌드위치에 들어가는 재료와 빵만 수정 가능하도록 만듦
public class EditSandwich { 

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class Request{
        @NotNull
        private Integer sandwichSize;
        @NotNull
        private Bread bread;
        @NotNull
        private Topping topping;
        @NotNull
        private Cheese cheese;
        @NotNull
        private Vegetable vegetable;
        @NotNull
        private SandwichSource sandwichSource;
    }
}
