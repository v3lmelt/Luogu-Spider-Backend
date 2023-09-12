package com.v3lmelt.LuoguCrawlerBackend.entity;

public class ExerciseQueryEntity {
    private String exercise_id;
    private String tags;
    private String difficulty;
    private String title;
    private String exercise_path;
    private String solution_path;
    public Integer pageSize;
    public Integer pageNum;
    public ExerciseQueryEntity(String exercise_id, String tags, String difficulty, String title, String exercise_path, String solution_path, Integer pageSize, Integer pageNum) {
        this.exercise_id = exercise_id;
        this.tags = tags;
        this.difficulty = difficulty;
        this.title = title;
        this.exercise_path = exercise_path;
        this.solution_path = solution_path;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
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

    public String getSolution_path() {
        return solution_path;
    }

    public void setSolution_path(String solution_path) {
        this.solution_path = solution_path;
    }
}
