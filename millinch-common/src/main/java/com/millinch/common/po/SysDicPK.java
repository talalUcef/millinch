package com.millinch.common.po;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/2
 */
public class SysDicPK implements Serializable {
    private String code;
    private String key;

    @Column(name = "code", nullable = false, insertable = true, updatable = true, length = 50)
    @Id
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "key", nullable = false, insertable = true, updatable = true, length = 50)
    @Id
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysDicPK sysDicPK = (SysDicPK) o;

        if (code != null ? !code.equals(sysDicPK.code) : sysDicPK.code != null) return false;
        if (key != null ? !key.equals(sysDicPK.key) : sysDicPK.key != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }
}
