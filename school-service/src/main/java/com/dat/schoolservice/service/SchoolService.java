package com.dat.schoolservice.service;

import com.dat.schoolservice.entity.School;
import com.dat.schoolservice.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public void saveSchool(School school) {
        //Todo - use a DTO instead of School entity in the method param
        schoolRepository.save(school);
    }

    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }
}
