package biz.km2y.izseacs.manager.entity;

import javax.persistence.*;
@Entity

@Table(name="log_detail")
public class DetailLog {
	@Id
	@Column(name="device_id")
	private Integer deviceId = 0;
	@Column(name="frame_time")
	private String frameTime = "";
	@Column(name="demand_time")
	private String demandTime = "";
	@Column(name="power")
	private Integer power = 0;
	@Column(name="voltage")
	private Integer voltage = 0;
	@Column(name="current1")
	private Integer current1 = 0;
	@Column(name="current2")
	private Integer current2 = 0;
	@Column(name="current3")
	private Integer current3 = 0;
	@Column(name="current4")
	private Integer current4 = 0;
	@Column(name="current5")
	private Integer current5 = 0;
	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	public String getFrameTime() {
		return frameTime;
	}
	public void setFrameTime(String frameTime) {
		this.frameTime = frameTime;
	}
	public String getDemandTime() {
		return demandTime;
	}
	public void setDemandTime(String demandTime) {
		this.demandTime = demandTime;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public Integer getVoltage() {
		return voltage;
	}
	public void setVoltage(Integer voltage) {
		this.voltage = voltage;
	}
	public Integer getCurrent1() {
		return current1;
	}
	public void setCurrent1(Integer current1) {
		this.current1 = current1;
	}
	public Integer getCurrent2() {
		return current2;
	}
	public void setCurrent2(Integer current2) {
		this.current2 = current2;
	}
	public Integer getCurrent3() {
		return current3;
	}
	public void setCurrent3(Integer current3) {
		this.current3 = current3;
	}
	public Integer getCurrent4() {
		return current4;
	}
	public void setCurrent4(Integer current4) {
		this.current4 = current4;
	}
	public Integer getCurrent5() {
		return current5;
	}
	public void setCurrent5(Integer current5) {
		this.current5 = current5;
	}
	public Integer getCurrent6() {
		return current6;
	}
	public void setCurrent6(Integer current6) {
		this.current6 = current6;
	}
	public Integer getCurrent7() {
		return current7;
	}
	public void setCurrent7(Integer current7) {
		this.current7 = current7;
	}
	public Integer getCurrent8() {
		return current8;
	}
	public void setCurrent8(Integer current8) {
		this.current8 = current8;
	}
	public Integer getTemperture1() {
		return temperture1;
	}
	public void setTemperture1(Integer temperture1) {
		this.temperture1 = temperture1;
	}
	public Integer getTemperture2() {
		return temperture2;
	}
	public void setTemperture2(Integer temperture2) {
		this.temperture2 = temperture2;
	}
	public Integer getTemperture3() {
		return temperture3;
	}
	public void setTemperture3(Integer temperture3) {
		this.temperture3 = temperture3;
	}
	public Integer getTemperture4() {
		return temperture4;
	}
	public void setTemperture4(Integer temperture4) {
		this.temperture4 = temperture4;
	}
	public Integer getTemperture5() {
		return temperture5;
	}
	public void setTemperture5(Integer temperture5) {
		this.temperture5 = temperture5;
	}
	public Integer getTemperture6() {
		return temperture6;
	}
	public void setTemperture6(Integer temperture6) {
		this.temperture6 = temperture6;
	}
	public Integer getTemperture7() {
		return temperture7;
	}
	public void setTemperture7(Integer temperture7) {
		this.temperture7 = temperture7;
	}
	public Integer getTemperture8() {
		return temperture8;
	}
	public void setTemperture8(Integer temperture8) {
		this.temperture8 = temperture8;
	}
	public Integer getRy_status() {
		return ry_status;
	}
	public void setRy_status(Integer ry_status) {
		this.ry_status = ry_status;
	}
	public Integer getMode1() {
		return mode1;
	}
	public void setMode1(Integer mode1) {
		this.mode1 = mode1;
	}
	public Integer getMode2() {
		return mode2;
	}
	public void setMode2(Integer mode2) {
		this.mode2 = mode2;
	}
	public Integer getMode3() {
		return mode3;
	}
	public void setMode3(Integer mode3) {
		this.mode3 = mode3;
	}
	public Integer getMode4() {
		return mode4;
	}
	public void setMode4(Integer mode4) {
		this.mode4 = mode4;
	}
	public Integer getInput1() {
		return input1;
	}
	public void setInput1(Integer input1) {
		this.input1 = input1;
	}
	public Integer getInput2() {
		return input2;
	}
	public void setInput2(Integer input2) {
		this.input2 = input2;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	@Column(name="current6")
	private Integer current6 = 0;
	@Column(name="current7")
	private Integer current7 = 0;
	@Column(name="current8")
	private Integer current8 = 0;
	@Column(name="temperture1")
	private Integer temperture1 = 0;
	@Column(name="temperture2")
	private Integer temperture2 = 0;
	@Column(name="temperture3")
	private Integer temperture3 = 0;
	@Column(name="temperture4")
	private Integer temperture4 = 0;
	@Column(name="temperture5")
	private Integer temperture5 = 0;
	@Column(name="temperture6")
	private Integer temperture6 = 0;
	@Column(name="temperture7")
	private Integer temperture7 = 0;
	@Column(name="temperture8")
	private Integer temperture8 = 0;
	@Column(name="ry_status")
	private Integer ry_status = 0;
	@Column(name="mode1")
	private Integer mode1= 0;
	@Column(name="mode2")
	private Integer mode2 = 0;
	@Column(name="mode3")
	private Integer mode3 = 0;
	@Column(name="mode4")
	private Integer mode4 = 0;
	@Column(name="input1")
	private Integer input1 = 0;
	@Column(name="input2")
	private Integer input2 = 0;
	@Column(name="valid")
	private Boolean valid = false;

}