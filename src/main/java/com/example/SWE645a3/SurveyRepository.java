package com.example.SWE645a3;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyModel, Integer>{
    List<SurveyModel> findAll();
    SurveyModel findById(int id);
    int deleteById(int id);
}
