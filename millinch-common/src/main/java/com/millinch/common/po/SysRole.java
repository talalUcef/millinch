package com.millinch.common.po;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/2
 */
@Entity
@Table(name = "sys_role", schema = "", catalog = "millinch_ums")
public class SysRole {
    private Long id;
    private String name;
    private String code;
    private String remark;
    private String nameLocation;
    private String idLocation;
    private Long branchId;
    private String status;
    private String creator;
    private Timestamp createTime;
    private String corrector;
    private Timestamp updateTime;
    private SysBranch branch;
    private Collection<SysRolePermission> rolePermissions;
    private Collection<SysUserRole> userRoles;

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
    @Column(name = "code", nullable = false, insertable = true, updatable = true, length = 255)
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
    @Column(name = "branch_id", nullable = false, insertable = false, updatable = false)
    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
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

        SysRole sysRole = (SysRole) o;

        if (id != null ? !id.equals(sysRole.id) : sysRole.id != null) return false;
        if (name != null ? !name.equals(sysRole.name) : sysRole.name != null) return false;
        if (code != null ? !code.equals(sysRole.code) : sysRole.code != null) return false;
        if (remark != null ? !remark.equals(sysRole.remark) : sysRole.remark != null) return false;
        if (nameLocation != null ? !nameLocation.equals(sysRole.nameLocation) : sysRole.nameLocation != null)
            return false;
        if (idLocation != null ? !idLocation.equals(sysRole.idLocation) : sysRole.idLocation != null) return false;
        if (branchId != null ? !branchId.equals(sysRole.branchId) : sysRole.branchId != null) return false;
        if (status != null ? !status.equals(sysRole.status) : sysRole.status != null) return false;
        if (creator != null ? !creator.equals(sysRole.creator) : sysRole.creator != null) return false;
        if (createTime != null ? !createTime.equals(sysRole.createTime) : sysRole.createTime != null) return false;
        if (corrector != null ? !corrector.equals(sysRole.corrector) : sysRole.corrector != null) return false;
        if (updateTime != null ? !updateTime.equals(sysRole.updateTime) : sysRole.updateTime != null) return false;

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
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (corrector != null ? corrector.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "id", nullable = false)
    public SysBranch getBranch() {
        return branch;
    }

    public void setBranch(SysBranch branch) {
        this.branch = branch;
    }

    @OneToMany(mappedBy = "role")
    public Collection<SysRolePermission> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(Collection<SysRolePermission> rolePermissions) {
        this.rolePermissions = rolePermissions;
    }

    @OneToMany(mappedBy = "role")
    public Collection<SysUserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Collection<SysUserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
