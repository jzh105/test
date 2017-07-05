package com.yuze.user.model;

public class AcMenu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_menu.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_menu.name
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_menu.uri
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private String uri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ac_menu.parent_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    private Long parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_menu.id
     *
     * @return the value of ac_menu.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_menu.id
     *
     * @param id the value for ac_menu.id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_menu.name
     *
     * @return the value of ac_menu.name
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_menu.name
     *
     * @param name the value for ac_menu.name
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_menu.uri
     *
     * @return the value of ac_menu.uri
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public String getUri() {
        return uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_menu.uri
     *
     * @param uri the value for ac_menu.uri
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ac_menu.parent_id
     *
     * @return the value of ac_menu.parent_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ac_menu.parent_id
     *
     * @param parentId the value for ac_menu.parent_id
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", uri=").append(uri);
        sb.append(", parentId=").append(parentId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
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
        AcMenu other = (AcMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUri() == null ? other.getUri() == null : this.getUri().equals(other.getUri()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ac_menu
     *
     * @mbg.generated Tue Jul 04 11:09:44 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUri() == null) ? 0 : getUri().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        return result;
    }
}