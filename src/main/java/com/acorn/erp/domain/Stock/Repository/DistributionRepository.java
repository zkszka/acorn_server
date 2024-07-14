package com.acorn.erp.domain.Stock.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.acorn.erp.domain.Stock.Entity.Distribution;

@Repository
public interface DistributionRepository extends JpaRepository<Distribution, Long> {
	 List<Distribution> findByDistributionCodeContainingIgnoreCaseOrDistributionNameContainingIgnoreCase(String distributionCode, String distributionName);
}
