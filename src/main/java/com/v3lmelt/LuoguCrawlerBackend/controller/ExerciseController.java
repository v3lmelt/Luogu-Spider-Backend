package com.v3lmelt.LuoguCrawlerBackend.controller;


import com.v3lmelt.LuoguCrawlerBackend.common.Result;
import com.v3lmelt.LuoguCrawlerBackend.entity.ExerciseEntity;
import com.v3lmelt.LuoguCrawlerBackend.entity.ExerciseQueryEntity;
import com.v3lmelt.LuoguCrawlerBackend.service.ExerciseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ExerciseController {
    @Resource
    private ExerciseService _ExerciseService;

    @GetMapping("/search")
    public Result FindBySearch(ExerciseQueryEntity param){
        return Result.success(_ExerciseService.FindBySearch(param));
    }

    @GetMapping("/get-all")
    public Result GetAllExercise(){
        return Result.success(_ExerciseService.GetAllExercise());
    }

}