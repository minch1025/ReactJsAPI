package biz.km2y.izseacs.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import biz.km2y.izseacs.manager.entity.DemandLog;
import biz.km2y.izseacs.manager.entity.DetailLog;
import biz.km2y.izseacs.manager.entity.Device;
import biz.km2y.izseacs.manager.repository.DemandLogRepository;
import biz.km2y.izseacs.manager.repository.DetailLogRepository;
import biz.km2y.izseacs.manager.repository.DeviceRepository;



@RestController

public class Hello {
	
	@Autowired
	DemandLogRepository repo;

	
	@RequestMapping(value ="/sample", method = RequestMethod.GET)
	public ResponseEntity<List<DemandLog>> index() {
		List<DemandLog> list = repo.findAll();
		System.out.println(list.get(0));
		return ResponseEntity.ok().body(list);
	}
	@Autowired
	DeviceRepository DR;
	@RequestMapping(value ="/device", method = RequestMethod.GET)
	public ResponseEntity<List<Device>> a() {
		List<Device> list = DR.findAll();
		return ResponseEntity.ok().body(list);
	}
	@Autowired
	DetailLogRepository DL;
	@RequestMapping(value ="/detail", method = RequestMethod.GET)
	public ResponseEntity<List<DetailLog>> b() {
		List<DetailLog> list = DL.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
