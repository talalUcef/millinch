package com.millinch.common.dao.jpa;

import com.millinch.common.po.SysRole;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/3
 */
public interface SysRoleRepository extends PagingAndSortingRepository<SysRole, Long> {
}
