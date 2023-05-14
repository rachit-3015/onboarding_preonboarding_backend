package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entities.LoginEntity;

@Repository
public interface LoginRepo extends JpaRepository<LoginEntity, String> {

	LoginEntity findByUsername(String username);
}
