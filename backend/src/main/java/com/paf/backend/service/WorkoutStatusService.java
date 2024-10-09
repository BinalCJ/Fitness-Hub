package com.paf.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paf.backend.entity.WorkoutStatus;
import com.paf.backend.repository.WorkoutStatusRepository;



@Service
public class WorkoutStatusService {

    @Autowired
    private WorkoutStatusRepository workoutStatusRepository;

    public void saveOrUpdate(WorkoutStatus workout_statuses){

        workoutStatusRepository.save(workout_statuses);
    }

    public Iterable<WorkoutStatus> listAll() {
       
        return this.workoutStatusRepository.findAll();
    }

    public void deleteWorkoutStatus(String _id) {
        
        workoutStatusRepository.deleteById(_id);
    }

    public WorkoutStatus getWorkoutStatusById(String _id) {
        
        return workoutStatusRepository.findById(_id).get();
    }

}
