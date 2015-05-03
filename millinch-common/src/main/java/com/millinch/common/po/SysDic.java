package com.millinch.common.po;

import javax.persistence.*;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/2
 */
@Entity
@Table(name = "sys_dic", schema = "", catalog = "millinch_ums")
@IdClass(SysDicPK.class)
public class SysDic {
    private String code;
    private String key;
    private String value;

    @Id
    @Column(name = "code", nullable = false, insertable = true, updatable = true, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Id
    @Column(name = "key", nullable = false, insertable = true, updatable = true, length = 50)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Basic
    @Column(name = "value", nullable = false, insertable = true, updatable = true, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysDic sysDic = (SysDic) o;

        if (code != null ? !code.equals(sysDic.code) : sysDic.code != null) return false;
        if (key != null ? !key.equals(sysDic.key) : sysDic.key != null) return false;
        if (value != null ? !value.equals(sysDic.value) : sysDic.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
