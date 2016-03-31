package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created on: 3/27/2016
 * Author    :
 */
public interface GoalRepository {

    Goal save(Goal goal);

    List<Goal> loadAll();

    List<GoalReport> findAllGoalReports();
}
