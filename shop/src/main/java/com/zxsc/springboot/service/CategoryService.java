package com.zxsc.springboot.service;

import com.zxsc.springboot.bean.Category;
import com.zxsc.springboot.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@CacheConfig(cacheNames = "category")
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public List<Category> selectCategory(){
        List<Category> categoryList = (List<Category>) categoryMapper.selectCategory();
        return categoryList;
    }

    public List<Category> selectCategoryById(Integer id){
        List<Category> categoryList = (List<Category>) categoryMapper.selectCategoryById(id);
        return categoryList;
    }

    public List<Category> selectCategoryByParentId(Integer parent_id){
        List<Category> categoryList = (List<Category>) categoryMapper.selectCategoryByParentId(parent_id);
        return categoryList;
    }
}
