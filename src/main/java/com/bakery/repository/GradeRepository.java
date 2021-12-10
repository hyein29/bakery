package com.bakery.repository;

import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface GradeRepository extends JpaRepository<Grade, Integer> {
}
