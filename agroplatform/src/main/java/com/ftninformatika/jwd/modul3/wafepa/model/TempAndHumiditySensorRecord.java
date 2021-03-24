package com.ftninformatika.jwd.modul3.wafepa.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TempAndHumiditySensorRecord {
@Id
@GeneratedValue
	private Long id;
private Long serialNumberOfSensor;
@ManyToOne(fetch=FetchType.EAGER)
private User user;
private Double temp;
private Double humedity;
private LocalDateTime time;

public TempAndHumiditySensorRecord() {
	super();
}

public TempAndHumiditySensorRecord(Long serialNumberOfSensor, User user, Double temp, Double humedity, LocalDateTime time) {
	super();
	this.serialNumberOfSensor = serialNumberOfSensor;
	this.user = user;
	this.temp = temp;
	this.humedity = humedity;
	this.time = time;
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

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
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
