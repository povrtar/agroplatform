package com.ftninformatika.jwd.modul3.wafepa.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;
import com.ftninformatika.jwd.modul3.wafepa.model.TempAndHumiditySensorRecord;

public interface TempAndHumiditySensorRecordService {
	
	List<TempAndHumiditySensorRecord> all();
	Optional<TempAndHumiditySensorRecord> one(Long id);
	TempAndHumiditySensorRecord save(TempAndHumiditySensorRecord tempAndHumidityRecord);
	TempAndHumiditySensorRecord delete(Long id);
	List<TempAndHumiditySensorRecord> search(
			@Param("serialNumber")Long serialNumber,
			@Param ("userId") Long userId,
			@Param("before") LocalDateTime before, 
			@Param("after") LocalDateTime after);
}
