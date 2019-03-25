package biz.km2y.izseacs.manager.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import biz.km2y.izseacs.manager.entity.Device;


		
		@Repository
		public interface DeviceRepository extends JpaRepository<Device, Integer>  {
		    public List<Device> findTop20ByOrderByDeviceId();
		}
	
