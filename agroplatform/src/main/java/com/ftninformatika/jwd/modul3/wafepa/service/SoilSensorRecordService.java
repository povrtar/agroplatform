package com.ftninformatika.jwd.modul3.wafepa.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.query.Param;
import com.ftninformatika.jwd.modul3.wafepa.model.SoilSensorRecord;

public interface SoilSensorRecordService {
	
	List<SoilSensorRecord> search(
			@Param("fieldId") Long fieldId,
			@Param("serialNumber")Long serialNumber,
			@Param ("userId") Long userId,
			@Param("before") LocalDateTime before, 
			@Param("after") LocalDateTime after);
	List<SoilSensorRecord> all();
	Optional<SoilSensorRecord> one(Long id);
	SoilSensorRecord save(SoilSensorRecord record);
	
	SoilSensorRecord delete(Long id);
	List<SoilSensorRecord> byUserId(Long userId);
	

}
