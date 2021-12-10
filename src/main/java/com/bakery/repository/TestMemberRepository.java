package com.bakery.repository;

import com.bakery.entity.Member;
import com.bakery.entity.TestMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface TestMemberRepository extends JpaRepository<TestMember, Long> {
}
