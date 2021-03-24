package com.ftninformatika.jwd.modul3.wafepa.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class RelayRecord {
@Id
@GeneratedValue
private Long id;
private Long  serialNumber;
@ManyToOne(fetch=FetchType.EAGER)
private User user;
private Boolean first;
private Boolean second;
private LocalDateTime time;
public RelayRecord() {
	super();
}
public RelayRecord(Long serialNumber, User user, Boolean first, Boolean second, LocalDateTime time) {
	super();
	this.serialNumber = serialNumber;
	this.user = user;
	this.first = first;
	this.second = second;
	this.time = time;
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
public Boolean getFirst() {
	return first;
}
public void setFirst(Boolean first) {
	this.first = first;
}
public Boolean getSecond() {
	return second;
}
public void setSecond(Boolean second) {
	this.second = second;
}
public LocalDateTime getTime() {
	return time;
}
public void setTime(LocalDateTime time) {
	this.time = time;
}


}
