package com.ftninformatika.jwd.modul3.wafepa.web.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class RelayRecordDto {
	private Long id;
	private Long  serialNumber;
	private Long userId;
	private Boolean first;
	private Boolean second;
	private LocalDateTime time;
	public RelayRecordDto() {
		super();
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
