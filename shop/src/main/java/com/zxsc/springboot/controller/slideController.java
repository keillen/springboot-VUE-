package com.zxsc.springboot.controller;

import com.zxsc.springboot.bean.Slide;
import com.zxsc.springboot.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/slide")
@CrossOrigin
public class slideController {
    @Autowired
    SlideService slideService;

    @GetMapping("/ss")
    public List<Slide> selectSlide(){
        List<Slide> categoryList = (List<Slide>) slideService.selectSlide();
        return categoryList;
    }
}
