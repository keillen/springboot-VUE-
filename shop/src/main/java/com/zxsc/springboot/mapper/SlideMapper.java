package com.zxsc.springboot.mapper;

import com.zxsc.springboot.bean.Slide;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SlideMapper {
    @Select("select * from jq_slide")
    List<Slide> selectSlide();
}
