package com.stiwk2124.project.springboot.backend.repository;

import com.stiwk2124.project.springboot.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
