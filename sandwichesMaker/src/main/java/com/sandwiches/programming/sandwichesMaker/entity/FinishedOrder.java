package com.sandwiches.programming.sandwichesMaker.entity;

import com.sandwiches.programming.sandwichesMaker.type.SandwichMenu;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
// 손님에게 나간 주문=> delete한 주문
public class FinishedOrder {
    // @Entity 규칙
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private Integer orderNumber;
    private SandwichMenu sandwichMenu;
    private Integer sandwichSize;
    private Integer sandwichNum;
}
