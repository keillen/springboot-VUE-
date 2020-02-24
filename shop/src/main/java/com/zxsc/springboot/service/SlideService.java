package com.zxsc.springboot.service;

import com.zxsc.springboot.bean.Category;
import com.zxsc.springboot.bean.Slide;
import com.zxsc.springboot.mapper.CategoryMapper;
import com.zxsc.springboot.mapper.SlideMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@CacheConfig(cacheNames = "category")
public class SlideService {
    @Autowired
    SlideMapper slideMapper;

    public List<Slide> selectSlide(){
        List<Slide> slideList = (List<Slide>) slideMapper.selectSlide();
        return slideList;
    }
}
