package com.bakery.repository;

import com.bakery.entity.Authority;
import com.bakery.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {

}
