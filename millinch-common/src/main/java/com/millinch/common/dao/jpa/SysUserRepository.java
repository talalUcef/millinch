package com.millinch.common.dao.jpa;

import com.millinch.common.po.SysUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/2
 */
public interface SysUserRepository extends PagingAndSortingRepository<SysUser, Long> {
}
