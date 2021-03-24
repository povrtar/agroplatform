package com.ftninformatika.jwd.modul3.wafepa.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.jwd.modul3.wafepa.model.TempAndHumiditySensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.repository.UserRepository;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.TempAndHumiditySensorRecordDto;

@Component
public class TempAndHumiditySensorRecordDtoToTempAndHumiditySensorRecord implements
Converter<TempAndHumiditySensorRecordDto,TempAndHumiditySensorRecord> {
@Autowired
UserRepository userRepository;
	@Override
	public TempAndHumiditySensorRecord convert(TempAndHumiditySensorRecordDto source) {
		TempAndHumiditySensorRecord record=new TempAndHumiditySensorRecord();
		record.setHumedity(source.getHumedity());
		record.setSerialNumberOfSensor(source.getSerialNumberOfSensor());
		record.setTemp(source.getTemp());
		record.setTime(source.getTime());
		record.setUser(userRepository.getOne(source.getUserId()));
		return record;
	}

}
