package com.sandwiches.programming.sandwichesMaker.dto;

import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import com.sandwiches.programming.sandwichesMaker.type.*;
import lombok.*;

import javax.validation.constraints.*;

public class CreateSandwich {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @ToString
    public static class Request{
        @NotNull
        @Min(1)
        @Max(100)
        //@Size(min=1, max=100, message="orderNumber size must 1~100")
        private Integer orderNumber;
        @NotNull
        private SandwichMenu sandwichMenu;
        @NotNull
        private Integer sandwichSize;
        @NotNull
        @Min(1)
        @Max(2)
        //@Size(min=1, max=5, message="You must order sandwiches 1~5")
        private Integer sandwichNum;
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
        private Integer sandwichSize;
        private Integer sandwichNum;
        private Bread bread;
        private Topping topping;
        private Cheese cheese;
        private Vegetable vegetable;
        private SandwichSource sandwichSource;

        public static Response fromEntity(Sandwich sandwich){
            return Response.builder()
                    .orderNumber(sandwich.getOrderNumber())
                    .sandwichMenu(sandwich.getSandwichMenu())
                    .sandwichSize(sandwich.getSandwichSize())
                    .sandwichNum(sandwich.getSandwichNum())
                    .bread(sandwich.getBread())
                    .topping(sandwich.getTopping())
                    .cheese(sandwich.getCheese())
                    .vegetable(sandwich.getVegetable())
                    .sandwichSource(sandwich.getSandwichSource())
                    .build();
        }
    }
}
