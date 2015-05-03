package com.millinch.common.po;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/2
 */
@Entity
@Table(name = "sys_branch", schema = "", catalog = "millinch_ums")
public class SysBranch {
    private Long id;
    private String name;
    private String code;
    private String remark;
    private String nameLocation;
    private String idLocation;
    private String status;
    private String creator;
    private Timestamp createTime;
    private String corrector;
    private Timestamp updateTime;
    private Set<SysRole> sysRoles;
    private Set<SysUser> sysUsers;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "code", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "remark", nullable = true, insertable = true, updatable = true, length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "name_location", nullable = false, insertable = true, updatable = true, length = 500)
    public String getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    @Basic
    @Column(name = "id_location", nullable = false, insertable = true, updatable = true, length = 500)
    public String getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(String idLocation) {
        this.idLocation = idLocation;
    }

    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "creator", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "create_time", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "corrector", nullable = true, insertable = true, updatable = true, length = 255)
    public String getCorrector() {
        return corrector;
    }

    public void setCorrector(String corrector) {
        this.corrector = corrector;
    }

    @Basic
    @Column(name = "update_time", nullable = true, insertable = true, updatable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysBranch sysBranch = (SysBranch) o;

        if (id != null ? !id.equals(sysBranch.id) : sysBranch.id != null) return false;
        if (name != null ? !name.equals(sysBranch.name) : sysBranch.name != null) return false;
        if (code != null ? !code.equals(sysBranch.code) : sysBranch.code != null) return false;
        if (remark != null ? !remark.equals(sysBranch.remark) : sysBranch.remark != null) return false;
        if (nameLocation != null ? !nameLocation.equals(sysBranch.nameLocation) : sysBranch.nameLocation != null)
            return false;
        if (idLocation != null ? !idLocation.equals(sysBranch.idLocation) : sysBranch.idLocation != null) return false;
        if (status != null ? !status.equals(sysBranch.status) : sysBranch.status != null) return false;
        if (creator != null ? !creator.equals(sysBranch.creator) : sysBranch.creator != null) return false;
        if (createTime != null ? !createTime.equals(sysBranch.createTime) : sysBranch.createTime != null) return false;
        if (corrector != null ? !corrector.equals(sysBranch.corrector) : sysBranch.corrector != null) return false;
        if (updateTime != null ? !updateTime.equals(sysBranch.updateTime) : sysBranch.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (nameLocation != null ? nameLocation.hashCode() : 0);
        result = 31 * result + (idLocation != null ? idLocation.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (corrector != null ? corrector.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "branch")
    public Set<SysRole> getSysRoles() {
        return sysRoles;
    }

    public void setSysRoles(Set<SysRole> sysRoles) {
        this.sysRoles = sysRoles;
    }

    @OneToMany(mappedBy = "branch")
    public Set<SysUser> getSysUsers() {
        return sysUsers;
    }

    public void setSysUsers(Set<SysUser> sysUsers) {
        this.sysUsers = sysUsers;
    }
}
