package com.sandwiches.programming.sandwichesMaker.repository;

import com.sandwiches.programming.sandwichesMaker.entity.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Long> {
}
