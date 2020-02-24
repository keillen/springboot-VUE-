package com.zxsc.springboot.service;

import com.zxsc.springboot.bean.*;
import com.zxsc.springboot.mapper.ClassificationGoodsMapper;
import com.zxsc.springboot.mapper.GoodsTypeMapper;
import com.zxsc.springboot.mapper.TypeTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {
    @Autowired
    private ClassificationGoodsMapper classificationGoodsMapper;
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    private TypeTypeMapper typeTypeMapper;

    public List<ClassificationGoods> FindAll() {
        List<ClassificationGoods> classificationGoods = classificationGoodsMapper.selectByExample(new ClassificationGoodsExample());
        for (int i = 0; i < classificationGoods.size(); i++) {
            List<GoodsType> goodsList = getGoodsTypeOne(classificationGoods.get(i).id);
            for (int j =0; j <goodsList.size();j++){
                List<TypeType> typeTypeList =getTypeTypeOne(goodsList.get(j).id);
                goodsList.get(j).typeTypes =typeTypeList;
                classificationGoods.get(i).goodsTypes = goodsList;
            }
        }
        return classificationGoods;
    }
    public List<TypeType> getTypeTypeOne(Integer id) {
        TypeTypeExample typeTypeExample = new TypeTypeExample();
        typeTypeExample.createCriteria().andGidEqualTo(id);
        List<TypeType> typeTypes = typeTypeMapper.selectByExample(typeTypeExample);
        return typeTypes;
    }

    public List<GoodsType> getGoodsTypeOne(Integer id) {
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        goodsTypeExample.createCriteria().andCidEqualTo(id);
        List<GoodsType> goodsTypes = goodsTypeMapper.selectByExample(goodsTypeExample);
        return goodsTypes;

    }
}
