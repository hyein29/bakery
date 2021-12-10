package com.bakery.repository;

import com.bakery.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@EnableJpaRepositories
public interface MemberRepository extends JpaRepository<Member, String> {

    Optional<Member> findByUsername(String username);

}
