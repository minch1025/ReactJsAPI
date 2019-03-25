package biz.km2y.izseacs.manager.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;


		@Entity
		@Table(name="device")
		public class Device {
			@Id
			@Column(name="device_id")
			private Integer deviceId = 0;
			@Column(name="name")
			private String name = "";
			@Column(name="ip")
			private String ip = "";
			@Column(name="equipment_no")
			private Integer equipmentNo = 0;
			@Column(name="imsi")
			private String imsi = "";
			@Column(name="msisdn")
			private String msisdn = "";
			@Column(name="sim_serial")
			private String sim_serial = "";
			@Column(name="imei")
			private String imei = "";
			@Column(name="geo_code")
			private String geoCode = "";
			@Column(name="serial_no")
			private String serialNo = "";
			@Column(name="model1")
			private String model1 = "";
			@Column(name="model2")
			private String model2 = "";
			@Column(name="model3")
			private Integer model3 = 0;
			@Column(name="model4")
			private Integer model4 = 0;
			@Column(name="system1")
			private Integer system1 = 0;
			@Column(name="system2")
			private Integer system2 = 0;
			@Column(name="system3")
			private Integer system3 = 0;
			
			@Column(name="system4")
			private Integer system4 = 0;
			@Column(name="enabled")
			private Boolean enabled= false;
			//@Column(name="created_at")
			//private	Integer createdAt= 0;
			//@Column(name="updated_at")
			//private Integer updatedAt= 0;
			
			
			
			public Integer getDeviceId() {
				return deviceId;
			}
			public void setDeviceId(Integer deviceId) {
				this.deviceId = deviceId;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getIp() {
				return ip;
			}
			public void setIp(String ip) {
				this.ip = ip;
			}
			public Integer getEquipmentNo() {
				return equipmentNo;
			}
			public void setEquipmentNo(Integer equipmentNo) {
				this.equipmentNo = equipmentNo;
			}
			public String getImsi() {
				return imsi;
			}
			public void setImsi(String imsi) {
				this.imsi = imsi;
			}
			public String getMsisdn() {
				return msisdn;
			}
			public void setMsisdn(String msisdn) {
				this.msisdn = msisdn;
			}
	
			public String getImei() {
				return imei;
			}
			public void setImei(String imei) {
				this.imei = imei;
			}
			public String getGeoCode() {
				return geoCode;
			}
			public void setGeoCode(String geoCode) {
				this.geoCode = geoCode;
			}
			public String getSerialNo() {
				return serialNo;
			}
			public void setSerialNo(String serialNo) {
				this.serialNo = serialNo;
			}
			public String getModel1() {
				return model1;
			}
			public void setModel1(String model1) {
				this.model1 = model1;
			}
			public String getModel2() {
				return model2;
			}
			public void setModel2(String model2) {
				this.model2 = model2;
			}
			public Integer getModel3() {
				return model3;
			}
			public void setModel3(Integer model3) {
				this.model3 = model3;
			}
			public Integer getModel4() {
				return model4;
			}
			public void setModel4(Integer model4) {
				this.model4 = model4;
			}
			public Integer getSystem1() {
				return system1;
			}
			public void setSystem1(Integer system1) {
				this.system1 = system1;
			}
			public Integer getSystem2() {
				return system2;
			}
			public void setSystem2(Integer system2) {
				this.system2 = system2;
			}
			public Integer getSystem3() {
				return system3;
			}
			public void setSystem3(Integer system3) {
				this.system3 = system3;
			}
			public Integer getSystem4() {
				return system4;
			}
			public void setSystem4(Integer system4) {
				this.system4 = system4;
			}
			public Boolean getEnabled() {
				return enabled;
			}
			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}
		//	public Integer getCreatedAt() {
		//		return createdAt;
		//	}
		//	public void setCreatedAt(Integer createdAt) {
		//		this.createdAt = createdAt;
		//	}
		//	public Integer getUpdatedAt() {
		//		return updatedAt;
		//	}
		//	public void setUpdatedAt(Integer updatedAt) {
		//		this.updatedAt = updatedAt;
		//	}
		
	}

