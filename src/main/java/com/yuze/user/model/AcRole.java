package com.yuze.user.model;

import java.util.Date;

public class AcRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.gmt_create
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.gmt_modified
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.name
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_role.parent_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    private Long parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.id
     *
     * @return the value of ac_role.id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.id
     *
     * @param id the value for ac_role.id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.gmt_create
     *
     * @return the value of ac_role.gmt_create
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.gmt_create
     *
     * @param gmtCreate the value for ac_role.gmt_create
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.gmt_modified
     *
     * @return the value of ac_role.gmt_modified
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.gmt_modified
     *
     * @param gmtModified the value for ac_role.gmt_modified
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.name
     *
     * @return the value of ac_role.name
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.name
     *
     * @param name the value for ac_role.name
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_role.parent_id
     *
     * @return the value of ac_role.parent_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_role.parent_id
     *
     * @param parentId the value for ac_role.parent_id
     *
     * @mbg.generated Fri Jul 07 08:50:10 CST 2017
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role
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
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role
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
        AcRole other = (AcRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_role
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        return result;
    }
}