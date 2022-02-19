package com.sandwiches.programming.sandwichesMaker.repository;

import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Long> {
    // 인텔리제이에서 제공하는 기능: jpa spring에서 메소드 명만 가지고도 특정 컬럼 명으로 검색할 수 있다.
    Optional<Sandwich> findByOrderNumber(Integer number);
}
