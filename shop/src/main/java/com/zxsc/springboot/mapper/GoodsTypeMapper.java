package com.zxsc.springboot.mapper;

import com.zxsc.springboot.bean.GoodsType;
import com.zxsc.springboot.bean.GoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    long countByExample(GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    int deleteByExample(GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    int insert(GoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    int insertSelective(GoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    List<GoodsType> selectByExampleWithRowbounds(GoodsTypeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    List<GoodsType> selectByExample(GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    GoodsType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    int updateByExample(@Param("record") GoodsType record, @Param("example") GoodsTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    int updateByPrimaryKeySelective(GoodsType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goodstype
     *
     * @mbg.generated Thu Dec 19 11:06:22 CST 2019
     */
    int updateByPrimaryKey(GoodsType record);
}