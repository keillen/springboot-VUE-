package com.zxsc.springboot.bean;

import lombok.Data;

import java.util.List;

@Data
public class ClassificationGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification.id
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    public Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classification.category
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    public String category;
    public List<GoodsType> goodsTypes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification.id
     *
     * @return the value of classification.id
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification.id
     *
     * @param id the value for classification.id
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification.category
     *
     * @return the value of classification.category
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification.category
     *
     * @param category the value for classification.category
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}