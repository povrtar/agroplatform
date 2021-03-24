package com.ftninformatika.jwd.modul3.wafepa.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.ftninformatika.jwd.modul3.wafepa.model.RelayRecord;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.RelayRecordDto;

@Component
public class RelayRecordToRelayRecordDto implements Converter<RelayRecord,RelayRecordDto>{

	@Override
	public RelayRecordDto convert(RelayRecord source) {
	RelayRecordDto dto=new RelayRecordDto();
	dto.setId(source.getId());
	dto.setFirst(source.getFirst());
	dto.setSecond(source.getSecond());
	dto.setSerialNumber(source.getSerialNumber());
	dto.setTime(source.getTime());
	dto.setUserId(source.getUser().getId());
		return dto;
	}
public List<RelayRecordDto> convert(List<RelayRecord> records){
	List<RelayRecordDto> dtos=new ArrayList<>();
	for(RelayRecord record:records) {
		dtos.add(convert(record));
	}
	return dtos;
}


}
