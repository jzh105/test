package com.yuze.user.dao;

import com.yuze.user.model.AcMenu;
import com.yuze.user.model.AcMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    long countByExample(AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int deleteByExample(AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int insert(AcMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int insertSelective(AcMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    List<AcMenu> selectByExample(AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    AcMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByExampleSelective(@Param("record") AcMenu record, @Param("example") AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByExample(@Param("record") AcMenu record, @Param("example") AcMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByPrimaryKeySelective(AcMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    int updateByPrimaryKey(AcMenu record);
}