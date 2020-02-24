package com.zxsc.springboot.controller;

import com.zxsc.springboot.bean.News;
import com.zxsc.springboot.bean.Slide;
import com.zxsc.springboot.service.NewsService;
import com.zxsc.springboot.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
@CrossOrigin
public class newsController {
    @Autowired
    NewsService newsService;

    @GetMapping("/sn")
    public List<News> selectNews(){
        List<News> newsList = (List<News>) newsService.selectNews();
        return newsList;
    }
}
