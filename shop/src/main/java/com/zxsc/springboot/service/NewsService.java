package com.zxsc.springboot.service;

import com.zxsc.springboot.bean.Item;
import com.zxsc.springboot.bean.News;
import com.zxsc.springboot.mapper.ItemMapper;
import com.zxsc.springboot.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@CacheConfig(cacheNames = "category")
public class NewsService {
    @Autowired
    NewsMapper newsMapper;

    public List<News> selectNews(){
        List<News> newsList = (List<News>) newsMapper.selectNews();
        return newsList;
    }
}
