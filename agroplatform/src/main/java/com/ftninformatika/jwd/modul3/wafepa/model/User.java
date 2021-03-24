package com.ftninformatika.jwd.modul3.wafepa.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String username;
	private String email;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private UserRole role;

	

	@OneToOne(fetch=FetchType.EAGER)
	private Address address;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<TempAndHumiditySensorRecord> tempAndHumeditySensorsRecords = new ArrayList<>();
@OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private List<RelayRecord> relaysRecords=new ArrayList<>();
@OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
private List<SoilSensorRecord> soilSensorsRecords=new ArrayList<>();
@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
private List<Field> fields=new ArrayList<>();

public User() {
	super();
}



public User(String username, String email, String password, UserRole role, Address address,
		List<TempAndHumiditySensorRecord> tempAndHumeditySensorsRecords, List<RelayRecord> relaysRecords,
		List<SoilSensorRecord> soilSensorsRecords) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
	this.role = role;
	this.address = address;
	this.tempAndHumeditySensorsRecords = tempAndHumeditySensorsRecords;
	this.relaysRecords = relaysRecords;
	this.soilSensorsRecords = soilSensorsRecords;
}



public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public List<TempAndHumiditySensorRecord> getTempAndHumeditySensorsRecords() {
	return tempAndHumeditySensorsRecords;
}

public void setTempAndHumeditySensorsRecords(List<TempAndHumiditySensorRecord> tempAndHumeditySensorsRecords) {
	this.tempAndHumeditySensorsRecords = tempAndHumeditySensorsRecords;
}

public List<RelayRecord> getRelaysRecords() {
	return relaysRecords;
}

public void setRelaysRecords(List<RelayRecord> relaysRecords) {
	this.relaysRecords = relaysRecords;
}

public List<SoilSensorRecord> getSoilSensorsRecords() {
	return soilSensorsRecords;
}

public void setSoilSensorsRecords(List<SoilSensorRecord> soilSensorsRecords) {
	this.soilSensorsRecords = soilSensorsRecords;
}

public UserRole getRole() {
	return role;
}

public void setRole(UserRole role) {
	this.role = role;
}



public List<Field> getFields() {
	return fields;
}



public void setFields(List<Field> fields) {
	this.fields = fields;
}
	
	
}
