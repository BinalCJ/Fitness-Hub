package com.paf.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paf.backend.entity.WorkoutStatus;



@Repository
public interface WorkoutStatusRepository extends MongoRepository<WorkoutStatus, String>{
    
}
