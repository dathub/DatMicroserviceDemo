package com.dat.schoolservice.repository;

import com.dat.schoolservice.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
