package com.millinch.common.dao.jpa;

import com.millinch.common.po.SysLog;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/5/3
 */
public interface SysLogRepository extends PagingAndSortingRepository<SysLog, Long> {
}
