package com.ftninformatika.jwd.modul3.wafepa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Corner {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne(fetch=FetchType.EAGER)
	private Field field;
	private Double latitude;
	private Double longitude;
	
	public Corner() {
		super();
	}

	public Corner(Field field, Double latitude, Double longitude) {
		super();
		this.field = field;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
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
	

}
