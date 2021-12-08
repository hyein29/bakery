package com.bakery.repository;

import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
}
