package com.liquibase.demoliquibase.repository;

import com.liquibase.demoliquibase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
