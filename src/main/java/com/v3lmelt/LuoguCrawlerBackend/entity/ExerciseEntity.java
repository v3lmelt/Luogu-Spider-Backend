package com.v3lmelt.LuoguCrawlerBackend.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="exercise")
public class ExerciseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String exercise_id;
    private String tags;
    private String difficulty;
    private String title;
    private String exercise_path;
    private String solution_path;

    private String exercise_author;
    private String solution_author;

    public ExerciseEntity(String exercise_id, String tags, String difficulty, String title, String exercise_path, String solution_path, String exercise_author, String solution_author) {
        this.exercise_id = exercise_id;
        this.tags = tags;
        this.difficulty = difficulty;
        this.title = title;
        this.exercise_path = exercise_path;
        this.solution_path = solution_path;
        this.exercise_author = exercise_author;
        this.solution_author = solution_author;
    }

    public String getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(String exercise_id) {
        this.exercise_id = exercise_id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExercise_path() {
        return exercise_path;
    }

    public void setExercise_path(String exercise_path) {
        this.exercise_path = exercise_path;
    }

    public String getExercise_author() {
        return exercise_author;
    }

    public void setExercise_author(String exercise_author) {
        this.exercise_author = exercise_author;
    }

    public String getSolution_author() {
        return solution_author;
    }

    public void setSolution_author(String solution_author) {
        this.solution_author = solution_author;
    }

    public String getSolution_path() {
        return solution_path;
    }

    public void setSolution_path(String solution_path) {
        this.solution_path = solution_path;
    }
}
