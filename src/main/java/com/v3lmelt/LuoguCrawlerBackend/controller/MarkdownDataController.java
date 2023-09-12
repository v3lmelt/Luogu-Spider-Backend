package com.v3lmelt.LuoguCrawlerBackend.controller;

import com.v3lmelt.LuoguCrawlerBackend.common.Result;
import com.v3lmelt.LuoguCrawlerBackend.entity.MarkdownDataEntity;
import com.v3lmelt.LuoguCrawlerBackend.service.MarkdownDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/markdown")
public class MarkdownDataController {
    @Resource
    private MarkdownDataService _markdownDataService;

    @GetMapping("/{id}")
    public Result GetMarkdownDataByID(@PathVariable Integer id) throws IOException {
        return Result.success(_markdownDataService.GetMarkdownDataByID(id));
    }
}
