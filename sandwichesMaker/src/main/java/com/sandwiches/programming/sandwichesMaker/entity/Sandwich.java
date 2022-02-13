package com.sandwiches.programming.sandwichesMaker.entity;

import com.sandwiches.programming.sandwichesMaker.type.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder // @Builder를 쓰려면 아래 @NoArgsContructor와 @AllArgsConstructor 두개를 모두 사용해야지 오류를 덜 발생시킬 수 있다.
@NoArgsConstructor
@AllArgsConstructor
@Entity // 만약 @Entity에 빨간줄이 뜨면 entity는 규격에 맞춰서 property를 만들어주면 빨간줄 없어진다.
public class Sandwich {

    // 주문번호
    private Integer orderNumber;

    // 주문시간
    @CreatedDate
    private LocalDateTime orderedTime;

    // 주문 샌드위치
    @Enumerated(EnumType.STRING)
    private SandwichMenu sandwichMenu;

    @Enumerated(EnumType.STRING)
    private Bread bread;

    @Enumerated(EnumType.STRING)
    private Topping topping;

    @Enumerated(EnumType.STRING)
    private Cheese cheese;

    @Enumerated(EnumType.STRING)
    private Vegetable vegetable;

    @Enumerated(EnumType.STRING)
    private SandwichSource sandwichSource;

}
