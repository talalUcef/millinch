package com.millinch.common.po;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/2
 */
@Entity
@Table(name = "sys_log", schema = "", catalog = "millinch_ums")
public class SysLog {
    private Long id;
    private String remark;
    private String creator;
    private Timestamp createTime;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "remark", nullable = false, insertable = true, updatable = true, length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "creator", nullable = false, insertable = true, updatable = true, length = 255)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysLog sysLog = (SysLog) o;

        if (id != null ? !id.equals(sysLog.id) : sysLog.id != null) return false;
        if (remark != null ? !remark.equals(sysLog.remark) : sysLog.remark != null) return false;
        if (creator != null ? !creator.equals(sysLog.creator) : sysLog.creator != null) return false;
        if (createTime != null ? !createTime.equals(sysLog.createTime) : sysLog.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
