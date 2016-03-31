package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created on: 3/27/2016
 * Author    :
 */

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

    @PersistenceContext
    private EntityManager em;

    public Exercise save(Exercise exercise) {

        em.persist(exercise);
        em.flush();

        return exercise;
    }
}
