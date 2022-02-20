package com.sandwiches.programming.sandwichesMaker.dto;

import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import com.sandwiches.programming.sandwichesMaker.type.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SandwichDetailDto {

    private Integer orderNumber;
    private SandwichMenu sandwichMenu;
    private Integer sandwichSize;
    private Integer sandwichNum;
    private Bread bread;
    private Topping topping;
    private Cheese cheese;
    private Vegetable vegetable;
    private SandwichSource sandwichSource;


    public static SandwichDetailDto fromEntity(Sandwich sandwich){
        return SandwichDetailDto.builder()
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
