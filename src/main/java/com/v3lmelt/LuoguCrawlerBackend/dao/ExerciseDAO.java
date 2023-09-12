package com.v3lmelt.LuoguCrawlerBackend.dao;


import com.v3lmelt.LuoguCrawlerBackend.entity.ExerciseEntity;
import com.v3lmelt.LuoguCrawlerBackend.entity.ExerciseQueryEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ExerciseDAO extends Mapper<ExerciseEntity>{
    List<ExerciseEntity> FindBySearch(@Param("param") ExerciseQueryEntity param);

}
