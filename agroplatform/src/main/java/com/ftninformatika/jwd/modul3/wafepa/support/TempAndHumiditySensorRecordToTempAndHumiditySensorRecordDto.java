package com.ftninformatika.jwd.modul3.wafepa.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.jwd.modul3.wafepa.model.TempAndHumiditySensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.repository.UserRepository;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.TempAndHumiditySensorRecordDto;

@Component
public class TempAndHumiditySensorRecordToTempAndHumiditySensorRecordDto implements
Converter<TempAndHumiditySensorRecord,TempAndHumiditySensorRecordDto> {
@Autowired
UserRepository userRepository;
	@Override
	public TempAndHumiditySensorRecordDto convert(TempAndHumiditySensorRecord source) {
		TempAndHumiditySensorRecordDto dto=new TempAndHumiditySensorRecordDto();
		dto.setHumedity(source.getHumedity());
		dto.setSerialNumberOfSensor(source.getSerialNumberOfSensor());
		dto.setTemp(source.getTemp());
		dto.setTime(source.getTime());
		dto.setUserId(source.getId());
		return dto;
	}
public List<TempAndHumiditySensorRecordDto> convert(List<TempAndHumiditySensorRecord> records){
	List<TempAndHumiditySensorRecordDto> dtos=new ArrayList<>();
	for(TempAndHumiditySensorRecord record:records) {
		dtos.add(convert(record));
	}
	return dtos;
}
}
