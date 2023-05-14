package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.EmployeeInfo;

public interface EmployeeRepo extends JpaRepository<EmployeeInfo, Long> {

}
