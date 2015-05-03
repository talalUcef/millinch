package com.millinch.common.dao.jpa;

import com.millinch.common.po.SysDic;
import com.millinch.common.po.SysDicPK;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/3
 */
public interface SysDicRepository extends PagingAndSortingRepository<SysDic, SysDicPK> {
}
