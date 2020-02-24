package com.zxsc.springboot.service;

import com.zxsc.springboot.bean.Category;
import com.zxsc.springboot.bean.Item;
import com.zxsc.springboot.bean.Slide;
import com.zxsc.springboot.mapper.ItemMapper;
import com.zxsc.springboot.mapper.SlideMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@CacheConfig(cacheNames = "category")
public class ItemService {
    @Autowired
    ItemMapper itemMapper;

    public List<Item> selectItem(){
        List<Item> itemList = (List<Item>) itemMapper.selectItem();
        return itemList;
    }

    public List<Item> selectItemById(Integer id){
        List<Item> itemList = (List<Item>) itemMapper.selectItemById(id);
        return itemList;
    }
}
