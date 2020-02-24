package com.zxsc.springboot.mapper;

import com.zxsc.springboot.bean.Item;
import com.zxsc.springboot.bean.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper {
    @Select("select * from jq_news")
    List<News> selectNews();
}
