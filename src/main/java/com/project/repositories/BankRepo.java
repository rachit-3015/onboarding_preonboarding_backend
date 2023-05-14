package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.LoginEntity;

public interface BankRepo extends JpaRepository<LoginEntity, Long>{

}
