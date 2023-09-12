package com.v3lmelt.LuoguCrawlerBackend.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.v3lmelt.LuoguCrawlerBackend.dao.ExerciseDAO;
import com.v3lmelt.LuoguCrawlerBackend.entity.ExerciseEntity;
import com.v3lmelt.LuoguCrawlerBackend.entity.ExerciseQueryEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExerciseService {

    @Resource
    private ExerciseDAO _exerciseDAO;

    public PageInfo<ExerciseEntity> FindBySearch(ExerciseQueryEntity param) {
        PageHelper.startPage(param.pageNum,param.pageSize);
        List<ExerciseEntity> list = _exerciseDAO.FindBySearch(param);

        return PageInfo.of(list);
    }

    public List<ExerciseEntity> GetAllExercise() {
        return _exerciseDAO.selectAll();
    }

    public ExerciseEntity GetExerciseByID(Integer id){
        return _exerciseDAO.selectByPrimaryKey(id);
    }
}
