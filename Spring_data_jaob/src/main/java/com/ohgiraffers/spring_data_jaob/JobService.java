package com.ohgiraffers.spring_data_jaob;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;


    public void saveJob(JobDTO jobDTO) {
        JobEntity jobEntity = new JobEntity();

        jobEntity.setJobCompanyName(jobDTO.getJobCompanyName());
        jobEntity.setJobInfoTitle(jobDTO.getJobInfoTitle());
        jobEntity.setJobWageType(jobDTO.getJobWageType());
        jobEntity.setJobSalary(jobDTO.getJobSalary());
        jobEntity.setJobLocation(jobDTO.getJobLocation());
        jobEntity.setJobEmploymentType(jobDTO.getJobEmploymentType());
//        jobEntity.setJobPostedDate(jobDTO.getJobPostedDate());
//        jobEntity.setJobClosingDate(jobDTO.getJobClosingDate());
        jobEntity.setJobWebInfoUrl(jobDTO.getJobWebInfoUrl());
        jobEntity.setJobMobileInfoUrl(jobDTO.getJobMobileInfoUrl());

        jobRepository.save(jobEntity);


    }
}
