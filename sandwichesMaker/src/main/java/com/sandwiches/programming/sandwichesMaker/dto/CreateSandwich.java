package com.sandwiches.programming.sandwichesMaker.dto;

import com.sandwiches.programming.sandwichesMaker.type.*;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateSandwich {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class Request{
        @Size(min=1, max=100, message="orderNumber size must 1~100")
        private Integer orderNumber;
        @NotNull
        private SandwichMenu sandwichMenu;
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

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Response{
        private Integer orderNumber;
        private SandwichMenu sandwichMenu;
        private Bread bread;
        private Topping topping;
        private Cheese cheese;
        private Vegetable vegetable;
        private SandwichSource sandwichSource;
    }
}
