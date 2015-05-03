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
@Table(name = "sys_user", schema = "", catalog = "millinch_ums")
public class SysUser {
    private Long id;
    private String userName;
    private String password;
    private String salt;
    private String email;
    private String mobilePhone;
    private String avatar;
    private Long branchId;
    private String status;
    private String creator;
    private Timestamp createTime;
    private String corrector;
    private Timestamp updateTime;
    private SysBranch branch;
    private Set<SysUserRole> userRoles;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_name", nullable = false, insertable = true, updatable = true, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "salt", nullable = false, insertable = true, updatable = true, length = 255)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "mobile_phone", nullable = true, insertable = true, updatable = true, length = 255)
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Basic
    @Column(name = "avatar", nullable = false, insertable = true, updatable = true, length = 255)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
    @Column(name = "update_time", nullable = true, insertable = true, updatable = false)
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

        SysUser sysUser = (SysUser) o;

        if (id != null ? !id.equals(sysUser.id) : sysUser.id != null) return false;
        if (userName != null ? !userName.equals(sysUser.userName) : sysUser.userName != null) return false;
        if (password != null ? !password.equals(sysUser.password) : sysUser.password != null) return false;
        if (salt != null ? !salt.equals(sysUser.salt) : sysUser.salt != null) return false;
        if (email != null ? !email.equals(sysUser.email) : sysUser.email != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(sysUser.mobilePhone) : sysUser.mobilePhone != null) return false;
        if (avatar != null ? !avatar.equals(sysUser.avatar) : sysUser.avatar != null) return false;
        if (branchId != null ? !branchId.equals(sysUser.branchId) : sysUser.branchId != null) return false;
        if (status != null ? !status.equals(sysUser.status) : sysUser.status != null) return false;
        if (creator != null ? !creator.equals(sysUser.creator) : sysUser.creator != null) return false;
        if (createTime != null ? !createTime.equals(sysUser.createTime) : sysUser.createTime != null) return false;
        if (corrector != null ? !corrector.equals(sysUser.corrector) : sysUser.corrector != null) return false;
        if (updateTime != null ? !updateTime.equals(sysUser.updateTime) : sysUser.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
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

    @OneToMany(mappedBy = "user")
    public Set<SysUserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<SysUserRole> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "branch=" + branch +
                ", id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", avatar='" + avatar + '\'' +
                ", branchId=" + branchId +
                ", status='" + status + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", corrector='" + corrector + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
