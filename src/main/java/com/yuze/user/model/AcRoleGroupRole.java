package com.yuze.user.model;

import java.util.Date;

public class AcRoleGroupRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_group_role.id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_group_role.gmt_create
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_group_role.gmt_modified
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_group_role.role_group_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Long roleGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role_group_role.role_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Long roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_group_role.id
     *
     * @return the value of ac_role_group_role.id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_group_role.id
     *
     * @param id the value for ac_role_group_role.id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_group_role.gmt_create
     *
     * @return the value of ac_role_group_role.gmt_create
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_group_role.gmt_create
     *
     * @param gmtCreate the value for ac_role_group_role.gmt_create
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_group_role.gmt_modified
     *
     * @return the value of ac_role_group_role.gmt_modified
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_group_role.gmt_modified
     *
     * @param gmtModified the value for ac_role_group_role.gmt_modified
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_group_role.role_group_id
     *
     * @return the value of ac_role_group_role.role_group_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Long getRoleGroupId() {
        return roleGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_group_role.role_group_id
     *
     * @param roleGroupId the value for ac_role_group_role.role_group_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setRoleGroupId(Long roleGroupId) {
        this.roleGroupId = roleGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role_group_role.role_id
     *
     * @return the value of ac_role_group_role.role_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role_group_role.role_id
     *
     * @param roleId the value for ac_role_group_role.role_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group_role
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", roleGroupId=").append(roleGroupId);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group_role
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AcRoleGroupRole other = (AcRoleGroupRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getRoleGroupId() == null ? other.getRoleGroupId() == null : this.getRoleGroupId().equals(other.getRoleGroupId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role_group_role
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getRoleGroupId() == null) ? 0 : getRoleGroupId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }
}