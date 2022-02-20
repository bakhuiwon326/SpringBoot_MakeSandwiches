package com.sandwiches.programming.sandwichesMaker.dto;

import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import com.sandwiches.programming.sandwichesMaker.type.SandwichMenu;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
// 세부적인 정보가 아닌 심플한 정보를 담는 sandwichdto
public class SandwichDto {
    private Integer orderNumber;
    private SandwichMenu sandwichMenu;
    private Integer sandwichSize;
    private Integer sandwichNum;

    public static SandwichDto fromEntity(Sandwich sandwich){
        return SandwichDto.builder()
                .orderNumber(sandwich.getOrderNumber())
                .sandwichMenu(sandwich.getSandwichMenu())
                .sandwichSize(sandwich.getSandwichSize())
                .sandwichNum(sandwich.getSandwichNum())
                .build();
    }
}
