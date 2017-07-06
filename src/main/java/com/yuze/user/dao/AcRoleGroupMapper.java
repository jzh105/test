package com.yuze.user.dao;

import com.yuze.user.model.AcRoleGroup;
import com.yuze.user.model.AcRoleGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcRoleGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    long countByExample(AcRoleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    int deleteByExample(AcRoleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    int insert(AcRoleGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    int insertSelective(AcRoleGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    List<AcRoleGroup> selectByExample(AcRoleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    AcRoleGroup selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    int updateByExampleSelective(@Param("record") AcRoleGroup record, @Param("example") AcRoleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    int updateByExample(@Param("record") AcRoleGroup record, @Param("example") AcRoleGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    int updateByPrimaryKeySelective(AcRoleGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group
     *
     * @mbg.generated Thu Jul 06 15:16:58 CST 2017
     */
    int updateByPrimaryKey(AcRoleGroup record);
}