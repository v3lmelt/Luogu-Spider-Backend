package com.v3lmelt.LuoguCrawlerBackend.service;


import com.v3lmelt.LuoguCrawlerBackend.entity.ExerciseEntity;
import com.v3lmelt.LuoguCrawlerBackend.entity.MarkdownDataEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class MarkdownDataService {
    @Resource
    private ExerciseService _exerciseService;

    private String GetMarkdownContentByPath(String path) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)));
        return content;
    }

    public MarkdownDataEntity GetMarkdownDataByID(Integer id) throws IOException {
        // 首先先拿到id对应的Exercise对象
        ExerciseEntity t = _exerciseService.GetExerciseByID(id);
        // 从后台中读取数据并封装
        String ExerciseFilePath = t.getExercise_path();
        String SolutionFilePath = t.getSolution_path();

        String ExerciseContent = GetMarkdownContentByPath(ExerciseFilePath);
        String SolutionContent = GetMarkdownContentByPath(SolutionFilePath);
        // 构建一个Entity对象
        return new MarkdownDataEntity(ExerciseContent,SolutionContent);
    }
}
