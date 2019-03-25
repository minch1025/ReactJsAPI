package biz.km2y.izseacs.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biz.km2y.izseacs.manager.entity.DemandLog;

@Repository
public interface DemandLogRepository extends JpaRepository<DemandLog, Integer> {
}
