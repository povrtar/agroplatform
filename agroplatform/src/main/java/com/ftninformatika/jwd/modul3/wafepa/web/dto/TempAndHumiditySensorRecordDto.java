package com.ftninformatika.jwd.modul3.wafepa.web.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.ftninformatika.jwd.modul3.wafepa.model.User;

public class TempAndHumiditySensorRecordDto {
	private Long id;
	private Long serialNumberOfSensor;
	private Long userId;
	private Double temp;
	private Double humedity;
	private LocalDateTime time;
	public TempAndHumiditySensorRecordDto() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSerialNumberOfSensor() {
		return serialNumberOfSensor;
	}
	public void setSerialNumberOfSensor(Long serialNumberOfSensor) {
		this.serialNumberOfSensor = serialNumberOfSensor;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Double getTemp() {
		return temp;
	}
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	public Double getHumedity() {
		return humedity;
	}
	public void setHumedity(Double humedity) {
		this.humedity = humedity;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
}
