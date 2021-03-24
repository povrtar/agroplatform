package com.ftninformatika.jwd.modul3.wafepa.support;

import java.util.ArrayList;
import java.util.List;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.ftninformatika.jwd.modul3.wafepa.model.SoilSensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.SoilSensorRecordDto;


@Component
public class SoilSensorRecordToSoilSensorRecordDto implements Converter<SoilSensorRecord,SoilSensorRecordDto>{

	@Override
	public SoilSensorRecordDto convert(SoilSensorRecord source) {
		SoilSensorRecordDto dto=new SoilSensorRecordDto();
		dto.setEc(source.getEc());
		dto.setHumedity(source.getHumedity());
		dto.setId(source.getId());
		dto.setLatitude(source.getLatitude());
		dto.setLongitude(source.getLongitude());
		dto.setField(source.getField());
		dto.setNitrogen(source.getNitrogen());
		dto.setPh(source.getPh());
		dto.setPhosporus(source.getPhosporus());
		dto.setPotasium(source.getPotasium());
		dto.setSerialNumber(source.getSerialNumber());
		dto.setTemp(source.getTemp());
		dto.setTime(source.getTime());
		dto.setUserId(source.getUser().getId());
		return dto;
	}
public List<SoilSensorRecordDto> convert(List<SoilSensorRecord> records){
	List<SoilSensorRecordDto> dtos=new ArrayList<>();
	for(SoilSensorRecord record:records) {
		dtos.add(convert(record));
	}
	return dtos;
} 
	
}
