package com.zxsc.springboot.controller;

import com.zxsc.springboot.bean.ClassificationGoods;
import com.zxsc.springboot.service.CategoryService;
import com.zxsc.springboot.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class categoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private InformationService informationService;
//    @GetMapping("/sc")
//    public List<Category> selectCategory(){
//        List<Category> categoryList = (List<Category>) categoryService.selectCategory();
//        return categoryList;
//    }
//
//    @GetMapping("/sid/{id}")
//    public List<Category> selectCategoryById(@PathVariable Integer id){
//        List<Category> categoryList = (List<Category>) categoryService.selectCategoryById(id);
//        return categoryList;
//    }
//
//    @GetMapping("/spid/{parent_id}")
//    public List<Category> selectCategoryByParentId(@PathVariable Integer parent_id){
//        List<Category> categoryList = (List<Category>) categoryService.selectCategoryByParentId(parent_id);
//        return categoryList;
//    }
//
    @GetMapping("/select")
    public List<ClassificationGoods> goods (){
        List<ClassificationGoods> classificationGoods = informationService.FindAll();
        return classificationGoods;
    }


}
