package com.zxsc.springboot.mapper;

import com.zxsc.springboot.bean.Item;
import com.zxsc.springboot.bean.Shop;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShopMapper {
    @Select("select * from jq_shop")
    List<Shop> selectShop();

    @Select("select * from jq_item where id = #{id}")
    List<Shop> selectShopById(Integer id);

    @Insert("Insert into jq_shop(id,title,price,num) values (#{id},#{title},#{price},#{num})")
    void addShop(Shop shop);

    @Delete("Delete from jq_shop where id = #{id}")
    int deleteShop(Integer id);

    @Update("Update jq_shop SET num = #{num} where id = #{id}")
    void updateShop(Shop shop);
}
