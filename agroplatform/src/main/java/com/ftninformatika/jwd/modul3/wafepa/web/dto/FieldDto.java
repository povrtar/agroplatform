package com.ftninformatika.jwd.modul3.wafepa.web.dto;

import java.util.List;
import com.ftninformatika.jwd.modul3.wafepa.model.Corner;

public class FieldDto {
	private Long id;
	
	private UserDto userDto;
	private String name;
	private String cadastralMunicipality;
	private String cadastralNumberOfParcel;
	private List<Corner> corners;
	List<SoilSensorRecordDto> recordsDto;
	public FieldDto() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserDto getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
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
	public List<SoilSensorRecordDto> getRecordsDto() {
		return recordsDto;
	}
	public void setRecordsDto(List<SoilSensorRecordDto> recordsDto) {
		this.recordsDto = recordsDto;
	}
	
	
}
