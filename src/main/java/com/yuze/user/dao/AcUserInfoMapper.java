package com.yuze.user.dao;

import com.yuze.user.model.AcUserInfo;
import com.yuze.user.model.AcUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    long countByExample(AcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int deleteByExample(AcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int insert(AcUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int insertSelective(AcUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    List<AcUserInfo> selectByExample(AcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    AcUserInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int updateByExampleSelective(@Param("record") AcUserInfo record, @Param("example") AcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int updateByExample(@Param("record") AcUserInfo record, @Param("example") AcUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int updateByPrimaryKeySelective(AcUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_user_info
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int updateByPrimaryKey(AcUserInfo record);
}