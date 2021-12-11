package com.bakery.repository;

import com.bakery.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
