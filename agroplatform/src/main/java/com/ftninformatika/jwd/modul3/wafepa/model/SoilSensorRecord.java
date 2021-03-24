package com.ftninformatika.jwd.modul3.wafepa.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SoilSensorRecord {
	@Id
	@GeneratedValue
	private Long id;
	private Long serialNumber;
	@ManyToOne(fetch=FetchType.EAGER)
	private User user;
	private LocalDateTime time;
	private Double latitude;
	private Double longitude;
	@ManyToOne(fetch=FetchType.LAZY)
	private Field field;
	private Double temp;
	private Double humedity;
	private Double ph;
	private Double ec;
	private Double nitrogen;
	private Double phosporus;
	private Double potasium;
	public SoilSensorRecord() {
		super();
	}
	public SoilSensorRecord(Long serialNumber, User user, LocalDateTime time, Double latitude, Double longitude,
			Double temp, Double humedity, Double ph, Double ec, Double nitrogen, Double phosporus, Double potasium) {
		super();
		this.serialNumber = serialNumber;
		this.user = user;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
		this.temp = temp;
		this.humedity = humedity;
		this.ph = ph;
		this.ec = ec;
		this.nitrogen = nitrogen;
		this.phosporus = phosporus;
		this.potasium = potasium;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
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
	public Double getPh() {
		return ph;
	}
	public void setPh(Double ph) {
		this.ph = ph;
	}
	public Double getEc() {
		return ec;
	}
	public void setEc(Double ec) {
		this.ec = ec;
	}
	public Double getNitrogen() {
		return nitrogen;
	}
	public void setNitrogen(Double nitrogen) {
		this.nitrogen = nitrogen;
	}
	public Double getPhosporus() {
		return phosporus;
	}
	public void setPhosporus(Double phosporus) {
		this.phosporus = phosporus;
	}
	public Double getPotasium() {
		return potasium;
	}
	public void setPotasium(Double potasium) {
		this.potasium = potasium;
	}
	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
	
	

	

}
