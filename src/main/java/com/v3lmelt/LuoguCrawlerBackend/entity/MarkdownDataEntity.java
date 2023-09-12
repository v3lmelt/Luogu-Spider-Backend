package com.v3lmelt.LuoguCrawlerBackend.entity;

public class MarkdownDataEntity {
    private String ExerciseMarkdownData;
    private String SolutionMarkdownData;

    public String getExerciseMarkdownData() {
        return ExerciseMarkdownData;
    }

    public void setExerciseMarkdownData(String exerciseMarkdownData) {
        ExerciseMarkdownData = exerciseMarkdownData;
    }

    public String getSolutionMarkdownData() {
        return SolutionMarkdownData;
    }

    public void setSolutionMarkdownData(String solutionMarkdownData) {
        SolutionMarkdownData = solutionMarkdownData;
    }

    public MarkdownDataEntity(String exerciseMarkdownData, String solutionMarkdownData) {
        ExerciseMarkdownData = exerciseMarkdownData;
        SolutionMarkdownData = solutionMarkdownData;
    }
}
