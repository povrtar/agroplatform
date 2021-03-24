package com.ftninformatika.jwd.modul3.wafepa.support;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.ftninformatika.jwd.modul3.wafepa.model.RelayRecord;
import com.ftninformatika.jwd.modul3.wafepa.repository.UserRepository;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.RelayRecordDto;

@Component
public class RelayRecordDtoToRelayRecord implements Converter<RelayRecordDto, RelayRecord>{
	
@Autowired
UserRepository userRepository;
	@Override
	public RelayRecord convert(RelayRecordDto source) {
		RelayRecord relayRecord=new RelayRecord();
		relayRecord.setSerialNumber(source.getSerialNumber());
		relayRecord.setFirst(source.getFirst());
		relayRecord.setSecond(source.getSecond());
		relayRecord.setUser(userRepository.getOne(source.getUserId()));
		if(source.getTime()==null) {
			relayRecord.setTime(LocalDateTime.now());
		}else {
			relayRecord.setTime(source.getTime());
		}
		return relayRecord;
	}

	
}
