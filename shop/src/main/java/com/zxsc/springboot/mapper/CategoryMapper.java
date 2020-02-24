package com.zxsc.springboot.mapper;

import com.zxsc.springboot.bean.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Select("select * from jq_category")
    List<Category> selectCategory();

    @Select("select * from jq_category where id = #{id}")
    List<Category> selectCategoryById(Integer id);

    @Select("select * from jq_category where parent_id = #{parent_id}")
    List<Category> selectCategoryByParentId(Integer parent_id);
}
