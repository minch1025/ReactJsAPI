package biz.km2y.izseacs.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import biz.km2y.izseacs.manager.entity.DetailLog;

@Repository
public interface DetailLogRepository extends JpaRepository<DetailLog, Integer> {
	public List<DetailLog> findTop20ByOrderByDetailLogId();
}
