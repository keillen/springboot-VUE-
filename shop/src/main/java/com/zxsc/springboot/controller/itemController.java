package com.zxsc.springboot.controller;

import com.zxsc.springboot.bean.Category;
import com.zxsc.springboot.bean.Item;
import com.zxsc.springboot.bean.Slide;
import com.zxsc.springboot.service.ItemService;
import com.zxsc.springboot.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class itemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/si")
    public List<Item> selectItem(){
        List<Item> itemList = (List<Item>) itemService.selectItem();
        return itemList;
    }
    @GetMapping("/sid/{id}")
    public List<Item> selectItemById(@PathVariable Integer id){
        List<Item> itemList = (List<Item>) itemService.selectItemById(id);
        return itemList;
    }
}
