package com.ftninformatika.jwd.modul3.wafepa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Field {
@Id
@GeneratedValue
private Long id;
@ManyToOne(fetch=FetchType.LAZY)
private User user;
private String name;
private String cadastralMunicipality;
private String cadastralNumberOfParcel;
@OneToMany(mappedBy="field",fetch=FetchType.EAGER)
private List<Corner> corners;
@OneToMany(mappedBy="field",fetch=FetchType.LAZY)
List<SoilSensorRecord> records;

public Field() {
	super();
}

public Field(User user, String name, String cadastralMunicipality, String cadastralNumberOfParcel, List<Corner> corners) {
	super();
	this.user = user;
	this.name = name;
	this.cadastralMunicipality = cadastralMunicipality;
	this.cadastralNumberOfParcel = cadastralNumberOfParcel;
	this.corners = corners;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCadastralMunicipality() {
	return cadastralMunicipality;
}



public void setCadastralMunicipality(String cadastralMunicipality) {
	this.cadastralMunicipality = cadastralMunicipality;
}



public String getCadastralNumberOfParcel() {
	return cadastralNumberOfParcel;
}



public void setCadastralNumberOfParcel(String cadastralNumberOfParcel) {
	this.cadastralNumberOfParcel = cadastralNumberOfParcel;
}



public List<Corner> getCorners() {
	return corners;
}

public void setCorners(List<Corner> corners) {
	this.corners = corners;
}

public List<SoilSensorRecord> getRecords() {
	return records;
}

public void setRecords(List<SoilSensorRecord> records) {
	this.records = records;
}

}
