package biz.km2y.izseacs.manager.entity;

import javax.persistence.*;
@Entity
@Table(name="log_demand")
public class DemandLog {
	@Id
	@Column(name="device_id")
	private Integer deviceId = 0;
	@Column(name="demand_time")
	private String demandTime = "";
	@Column(name="address")
	private Integer address = 0;
	@Column(name="version")
	private Integer version = 0;
	@Column(name="type")
	private String type = "";
	@Column(name="enabled_ch1")
	private Boolean enabledCH1 = false;
	@Column(name="enabled_ch2")
	private Boolean enabledCH2 = false;
	@Column(name="enabled_ch3")
	private Boolean enabledCH3 = false;
	@Column(name="enabled_ch4")
	private Boolean enabledCH4 = false;
	@Column(name="control_rate_ch1")
	private Integer controlRateCH1 = 0;
	@Column(name="control_rate_ch2")
	private Integer controlRateCH2 = 0;
	@Column(name="control_rate_ch3")
	private Integer controlRateCH3 = 0;
	@Column(name="control_rate_ch4")
	private Integer controlRateCH4 = 0;
	@Column(name="calculate_time")
	private Integer calculateTime = 0;
	@Column(name="avg_voltage")
	private Integer avgVoltage = 0;
	@Column(name="avg_power")
	private Integer avgPower = 0;
	@Column(name="avg_cufrrent1")
	private Integer avgCurrent1 = 0;
	@Column(name="avg_current2")
	private Integer avgCurrent2 = 0;
	@Column(name="avg_current3")
	private Integer avgCurrent3 = 0;
	@Column(name="avg_current4")
	private Integer avgCurrent4 = 0;
	@Column(name="avg_current5")
	private Integer avgCurrent5 = 0;
	@Column(name="avg_current6")
	private Integer avgCurrent6 = 0;
	@Column(name="avg_current7")
	private Integer avgCurrent7 = 0;
	@Column(name="avg_current8")
	private Integer avgCurrent8 = 0;
	@Column(name="avg_reduced_ch1")
	private Integer avgReducedCH1 = 0;
	@Column(name="avg_reduced_ch2")
	private Integer avgReducedCH2 = 0;
	@Column(name="avg_reduced_ch3")
	private Integer avgReducedCH3 = 0;
	@Column(name="avg_reduced_ch4")
	private Integer avgReducedCH4 = 0;
	@Column(name="control_num_ch1")
	private Integer controNumCH1 = 0;
	@Column(name="control_num_ch2")
	private Integer controNumCH2 = 0;
	@Column(name="control_num_ch3")
	private Integer controNumCH3 = 0;
	@Column(name="control_num_ch4")
	private Integer controNumCH4 = 0;
	@Column(name="off_num_ch1")
	private Integer offNumCH1 = 0;
	@Column(name="off_num_ch2")
	private Integer offNumCH2 = 0;
	@Column(name="off_num_ch3")
	private Integer offNumCH3 = 0;
	@Column(name="off_num_ch4")
	private Integer offNumCH4 = 0;
	@Column(name="worktime_ch1")
	private Integer worktimeCH1 = 0;
	@Column(name="worktime_ch2")
	private Integer worktimeCH2 = 0;
	@Column(name="worktime_ch3")
	private Integer worktimeCH3 = 0;
	@Column(name="worktime_ch4")
	private Integer worktimeCH4 = 0;
	@Column(name="control_time_ch1")
	private Integer controlTimeCH1 = 0;
	@Column(name="control_time_ch2")
	private Integer controlTimeCH2 = 0;
	@Column(name="control_time_ch3")
	private Integer controlTimeCH3 = 0;
	@Column(name="control_time_ch4")
	private Integer controlTimeCH4 = 0;
	@Column(name="stop_time_ch1")
	private Integer stopTimeCH1 = 0;
	@Column(name="stop_time_ch2")
	private Integer stopTimeCH2 = 0;
	@Column(name="stop_time_ch3")
	private Integer stopTimeCH3 = 0;
	@Column(name="stop_time_ch4")
	private Integer stopTimeCH4 = 0;
	@Column(name="valid")
	private Boolean valid = false;
	
	public Integer getDeviceId() {
		return deviceId;
	}
	public String getDemandTime() {
		return demandTime;
	}
	public Integer getAddress() {
		return address;
	}
	public Integer getVersion() {
		return version;
	}
	public String getType() {
		return type;
	}
	public Boolean getEnabledCH1() {
		return enabledCH1;
	}
	public Boolean getEnabledCH2() {
		return enabledCH2;
	}
	public Boolean getEnabledCH3() {
		return enabledCH3;
	}
	public Boolean getEnabledCH4() {
		return enabledCH4;
	}
	public Integer getControlRateCH1() {
		return controlRateCH1;
	}
	public Integer getControlRateCH2() {
		return controlRateCH2;
	}
	public Integer getControlRateCH3() {
		return controlRateCH3;
	}
	public Integer getControlRateCH4() {
		return controlRateCH4;
	}
	public Integer getCalculateTime() {
		return calculateTime;
	}
	public Integer getAvgVoltage() {
		return avgVoltage;
	}
	public Integer getAvgPower() {
		return avgPower;
	}
	public Integer getAvgCurrent1() {
		return avgCurrent1;
	}
	public Integer getAvgCurrent2() {
		return avgCurrent2;
	}
	public Integer getAvgCurrent3() {
		return avgCurrent3;
	}
	public Integer getAvgCurrent4() {
		return avgCurrent4;
	}
	public Integer getAvgCurrent5() {
		return avgCurrent5;
	}
	public Integer getAvgCurrent6() {
		return avgCurrent6;
	}
	public Integer getAvgCurrent7() {
		return avgCurrent7;
	}
	public Integer getAvgCurrent8() {
		return avgCurrent8;
	}
	public Integer getAvgReducedCH1() {
		return avgReducedCH1;
	}
	public Integer getAvgReducedCH2() {
		return avgReducedCH2;
	}
	public Integer getAvgReducedCH3() {
		return avgReducedCH3;
	}
	public Integer getAvgReducedCH4() {
		return avgReducedCH4;
	}
	public Integer getControNumCH1() {
		return controNumCH1;
	}
	public Integer getControNumCH2() {
		return controNumCH2;
	}
	public Integer getControNumCH3() {
		return controNumCH3;
	}
	public Integer getControNumCH4() {
		return controNumCH4;
	}
	public Integer getOffNumCH1() {
		return offNumCH1;
	}
	public Integer getOffNumCH2() {
		return offNumCH2;
	}
	public Integer getOffNumCH3() {
		return offNumCH3;
	}
	public Integer getOffNumCH4() {
		return offNumCH4;
	}
	public Integer getWorktimeCH1() {
		return worktimeCH1;
	}
	public Integer getWorktimeCH2() {
		return worktimeCH2;
	}
	public Integer getWorktimeCH3() {
		return worktimeCH3;
	}
	public Integer getWorktimeCH4() {
		return worktimeCH4;
	}
	public Integer getControlTimeCH1() {
		return controlTimeCH1;
	}
	public Integer getControlTimeCH2() {
		return controlTimeCH2;
	}
	public Integer getControlTimeCH3() {
		return controlTimeCH3;
	}
	public Integer getControlTimeCH4() {
		return controlTimeCH4;
	}
	public Integer getStopTimeCH1() {
		return stopTimeCH1;
	}
	public Integer getStopTimeCH2() {
		return stopTimeCH2;
	}
	public Integer getStopTimeCH3() {
		return stopTimeCH3;
	}
	public Integer getStopTimeCH4() {
		return stopTimeCH4;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	public void setDemandTime(String demandTime) {
		this.demandTime = demandTime;
	}
	public void setAddress(Integer address) {
		this.address = address;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setEnabledCH1(Boolean enabledCH1) {
		this.enabledCH1 = enabledCH1;
	}
	public void setEnabledCH2(Boolean enabledCH2) {
		this.enabledCH2 = enabledCH2;
	}
	public void setEnabledCH3(Boolean enabledCH3) {
		this.enabledCH3 = enabledCH3;
	}
	public void setEnabledCH4(Boolean enabledCH4) {
		this.enabledCH4 = enabledCH4;
	}
	public void setControlRateCH1(Integer controlRateCH1) {
		this.controlRateCH1 = controlRateCH1;
	}
	public void setControlRateCH2(Integer controlRateCH2) {
		this.controlRateCH2 = controlRateCH2;
	}
	public void setControlRateCH3(Integer controlRateCH3) {
		this.controlRateCH3 = controlRateCH3;
	}
	public void setControlRateCH4(Integer controlRateCH4) {
		this.controlRateCH4 = controlRateCH4;
	}
	public void setCalculateTime(Integer calculateTime) {
		this.calculateTime = calculateTime;
	}
	public void setAvgVoltage(Integer avgVoltage) {
		this.avgVoltage = avgVoltage;
	}
	public void setAvgPower(Integer avgPower) {
		this.avgPower = avgPower;
	}
	public void setAvgCurrent1(Integer avgCurrent1) {
		this.avgCurrent1 = avgCurrent1;
	}
	public void setAvgCurrent2(Integer avgCurrent2) {
		this.avgCurrent2 = avgCurrent2;
	}
	public void setAvgCurrent3(Integer avgCurrent3) {
		this.avgCurrent3 = avgCurrent3;
	}
	public void setAvgCurrent4(Integer avgCurrent4) {
		this.avgCurrent4 = avgCurrent4;
	}
	public void setAvgCurrent5(Integer avgCurrent5) {
		this.avgCurrent5 = avgCurrent5;
	}
	public void setAvgCurrent6(Integer avgCurrent6) {
		this.avgCurrent6 = avgCurrent6;
	}
	public void setAvgCurrent7(Integer avgCurrent7) {
		this.avgCurrent7 = avgCurrent7;
	}
	public void setAvgCurrent8(Integer avgCurrent8) {
		this.avgCurrent8 = avgCurrent8;
	}
	public void setAvgReducedCH1(Integer avgReducedCH1) {
		this.avgReducedCH1 = avgReducedCH1;
	}
	public void setAvgReducedCH2(Integer avgReducedCH2) {
		this.avgReducedCH2 = avgReducedCH2;
	}
	public void setAvgReducedCH3(Integer avgReducedCH3) {
		this.avgReducedCH3 = avgReducedCH3;
	}
	public void setAvgReducedCH4(Integer avgReducedCH4) {
		this.avgReducedCH4 = avgReducedCH4;
	}
	public void setControNumCH1(Integer controNumCH1) {
		this.controNumCH1 = controNumCH1;
	}
	public void setControNumCH2(Integer controNumCH2) {
		this.controNumCH2 = controNumCH2;
	}
	public void setControNumCH3(Integer controNumCH3) {
		this.controNumCH3 = controNumCH3;
	}
	public void setControNumCH4(Integer controNumCH4) {
		this.controNumCH4 = controNumCH4;
	}
	public void setOffNumCH1(Integer offNumCH1) {
		this.offNumCH1 = offNumCH1;
	}
	public void setOffNumCH2(Integer offNumCH2) {
		this.offNumCH2 = offNumCH2;
	}
	public void setOffNumCH3(Integer offNumCH3) {
		this.offNumCH3 = offNumCH3;
	}
	public void setOffNumCH4(Integer offNumCH4) {
		this.offNumCH4 = offNumCH4;
	}
	public void setWorktimeCH1(Integer worktimeCH1) {
		this.worktimeCH1 = worktimeCH1;
	}
	public void setWorktimeCH2(Integer worktimeCH2) {
		this.worktimeCH2 = worktimeCH2;
	}
	public void setWorktimeCH3(Integer worktimeCH3) {
		this.worktimeCH3 = worktimeCH3;
	}
	public void setWorktimeCH4(Integer worktimeCH4) {
		this.worktimeCH4 = worktimeCH4;
	}
	public void setControlTimeCH1(Integer controlTimeCH1) {
		this.controlTimeCH1 = controlTimeCH1;
	}
	public void setControlTimeCH2(Integer controlTimeCH2) {
		this.controlTimeCH2 = controlTimeCH2;
	}
	public void setControlTimeCH3(Integer controlTimeCH3) {
		this.controlTimeCH3 = controlTimeCH3;
	}
	public void setControlTimeCH4(Integer controlTimeCH4) {
		this.controlTimeCH4 = controlTimeCH4;
	}
	public void setStopTimeCH1(Integer stopTimeCH1) {
		this.stopTimeCH1 = stopTimeCH1;
	}
	public void setStopTimeCH2(Integer stopTimeCH2) {
		this.stopTimeCH2 = stopTimeCH2;
	}
	public void setStopTimeCH3(Integer stopTimeCH3) {
		this.stopTimeCH3 = stopTimeCH3;
	}
	public void setStopTimeCH4(Integer stopTimeCH4) {
		this.stopTimeCH4 = stopTimeCH4;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
}
