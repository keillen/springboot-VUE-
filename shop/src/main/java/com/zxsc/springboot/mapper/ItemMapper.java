package com.zxsc.springboot.mapper;

import com.zxsc.springboot.bean.Category;
import com.zxsc.springboot.bean.Item;
import com.zxsc.springboot.bean.Slide;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMapper {
    @Select("select * from jq_item")
    List<Item> selectItem();

    @Select("select * from jq_item where id = #{id}")
    List<Item> selectItemById(Integer id);

}
