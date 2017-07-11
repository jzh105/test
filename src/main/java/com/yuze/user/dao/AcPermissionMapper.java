package com.yuze.user.dao;

import com.yuze.framework.dao.BaseDao;
import com.yuze.user.model.AcPermission;
import com.yuze.user.model.AcPermissionExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AcPermissionMapper extends BaseDao<AcPermission, Long>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    long countByExample(AcPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int deleteByExample(AcPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int insert(AcPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int insertSelective(AcPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    List<AcPermission> selectByExample(AcPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    AcPermission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int updateByExampleSelective(@Param("record") AcPermission record, @Param("example") AcPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int updateByExample(@Param("record") AcPermission record, @Param("example") AcPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int updateByPrimaryKeySelective(AcPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_permission
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    int updateByPrimaryKey(AcPermission record);

    /**
     * 通过角色id 查询角色 拥有的权限
     *
     * @param roleId
     * @return
     */
    List<AcPermission> selectPermissionsByRoleId(Long roleId);
}