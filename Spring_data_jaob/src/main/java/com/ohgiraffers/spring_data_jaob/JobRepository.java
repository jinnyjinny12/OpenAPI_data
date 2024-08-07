package com.ohgiraffers.spring_data_jaob;


import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobEntity, Integer> {


}
