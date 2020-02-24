package com.zxsc.springboot;

import com.zxsc.springboot.bean.Category;
import com.zxsc.springboot.mapper.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTest {
    @Autowired
    CategoryMapper categoryMapper;

    @Test
    public void selectCategoryById(){
        List<Category> categoryList = (List<Category>) categoryMapper.selectCategoryById(1);
        System.out.println(categoryList);
    }
}
