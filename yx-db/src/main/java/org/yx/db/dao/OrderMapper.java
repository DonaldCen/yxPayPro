package org.yx.db.dao;

import org.apache.ibatis.annotations.Param;
import org.yx.db.domain.LitemallOrder;
import org.yx.db.domain.LitemallOrder;

import java.time.LocalDateTime;

public interface OrderMapper {
    int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime, @Param("order") LitemallOrder order);
}