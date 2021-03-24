package com.ftninformatika.jwd.modul3.wafepa.support;

import java.time.LocalDateTime;
import java.time.LocalTime;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.ftninformatika.jwd.modul3.wafepa.model.SoilSensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.SoilSensorRecordDto;



@Component
public class SoilSensorRecordDtoToSoilSensorRecord implements Converter<SoilSensorRecordDto,SoilSensorRecord>{

	@Override
	public SoilSensorRecord convert(SoilSensorRecordDto source) {
		SoilSensorRecord record=new SoilSensorRecord();
		record.setEc(source.getEc());
		record.setHumedity(source.getHumedity());
		record.setLatitude(source.getLatitude());
		record.setLongitude(source.getLongitude());
		record.setField(source.getField());
		record.setNitrogen(source.getNitrogen());
		record.setPh(source.getPh());
		record.setPhosporus(source.getPhosporus());
		record.setPotasium(source.getPotasium());
		record.setSerialNumber(source.getSerialNumber());
		record.setTemp(source.getTemp());
		if(source.getTime()==null) {
			record.setTime(LocalDateTime.now());
		}else {
			record.setTime(source.getTime());
		}
		return record;
	}
	
}
