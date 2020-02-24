package com.zxsc.springboot.controller;

import com.zxsc.springboot.bean.Item;
import com.zxsc.springboot.bean.Shop;
import com.zxsc.springboot.service.ItemService;
import com.zxsc.springboot.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
@CrossOrigin
public class shopController {
    @Autowired
    ShopService shopService;

    @GetMapping("/si")
    public List<Shop> selectShop(){
        List<Shop> shopList = (List<Shop>) shopService.selectShop();
        return shopList;
    }
    @GetMapping("/sid/{id}")
    public List<Shop> selectShopById(@PathVariable Integer id){
        List<Shop> shopList = (List<Shop>) shopService.selectShopById(id);
        return shopList;
    }
    @GetMapping("/add/{id}/{title}/{price}/{num}")
    public Shop addShop(Shop shop){
        return shopService.addShop(shop);
    }

    @GetMapping("/delete/{id}")
    public int deleteShop(@PathVariable Integer id){
        return shopService.deleteShop(id);
    }

    @GetMapping("/update/{id}/{title}/{price}/{num}")
    public Shop updateShop(Shop shop){
        return shopService.updateShop(shop);
    }
}
