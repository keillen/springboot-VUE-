package com.zxsc.springboot.service;

import com.zxsc.springboot.bean.Item;
import com.zxsc.springboot.bean.Shop;
import com.zxsc.springboot.mapper.ItemMapper;
import com.zxsc.springboot.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@CacheConfig(cacheNames = "category")
public class ShopService {
    @Autowired
    private ShopMapper shopMapper;


    public List<Shop> selectShop(){
        List<Shop> shopList = (List<Shop>) shopMapper.selectShop();
        return shopList;
    }

    public List<Shop> selectShopById(Integer id){
        List<Shop> shopList = (List<Shop>) shopMapper.selectShopById(id);
        return shopList;
    }

    public Shop addShop(Shop shop){
        shopMapper.addShop(shop);
        return shop;
    }

    public int deleteShop(Integer id){
        return shopMapper.deleteShop(id);
    }

    public Shop updateShop(Shop shop){
        shopMapper.updateShop(shop);
        return shop;
    }
}
