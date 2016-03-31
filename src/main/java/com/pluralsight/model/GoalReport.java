package com.pluralsight.model;

import com.pluralsight.repository.GoalRepository;

/**
 * Created on: 3/27/2016
 * Author    :
 */
public class GoalReport {

    private int goalMinutes;
    private int exerciseMinutes;
    private String exerciseActivity;

    public GoalReport(int goalMinutes, int exerciseMinutes, String exerciseActivity) {
        this.goalMinutes = goalMinutes;
        this.exerciseMinutes = exerciseMinutes;
        this.exerciseActivity = exerciseActivity;
    }

    public int getGoalMinutes() {
        return goalMinutes;
    }

    public void setGoalMinutes(int goalMinutes) {
        this.goalMinutes = goalMinutes;
    }

    public int getExerciseMinutes() {
        return exerciseMinutes;
    }

    public void setExerciseMinutes(int exerciseMinutes) {
        this.exerciseMinutes = exerciseMinutes;
    }

    public String getExerciseAtivity() {
        return exerciseActivity;
    }

    public void setExerciseAtivity(String exerciseActivity) {
        this.exerciseActivity = exerciseActivity;
    }

}
