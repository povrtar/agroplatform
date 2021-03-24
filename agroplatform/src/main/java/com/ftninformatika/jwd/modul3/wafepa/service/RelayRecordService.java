package com.ftninformatika.jwd.modul3.wafepa.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.query.Param;
import com.ftninformatika.jwd.modul3.wafepa.model.RelayRecord;

public interface RelayRecordService {
	

	List<RelayRecord> all();
	Optional<RelayRecord> one(Long id);
	RelayRecord save(RelayRecord record);
	
	RelayRecord delete(Long id);
	List<RelayRecord> search(Long userId,Long serialNumber,LocalTime after,LocalTime before);
	

}
