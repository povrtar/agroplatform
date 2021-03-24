package com.ftninformatika.jwd.modul3.wafepa.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftninformatika.jwd.modul3.wafepa.model.TempAndHumiditySensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.repository.TempAndHumiditySensorRecordRepository;
import com.ftninformatika.jwd.modul3.wafepa.service.TempAndHumiditySensorRecordService;

@Service
public class JpaTempAndHumiditySensorRecordService implements TempAndHumiditySensorRecordService {
@Autowired
private TempAndHumiditySensorRecordRepository repository;
	@Override
	public List<TempAndHumiditySensorRecord> all() {
		return repository.findAll();
	}

	@Override
	public Optional<TempAndHumiditySensorRecord> one(Long id) {
	return repository.findById(id);
	}

	@Override
	public TempAndHumiditySensorRecord save(TempAndHumiditySensorRecord tempAndHumidityRecord) {
		return repository.save(tempAndHumidityRecord);
		
	}

	@Override
	public TempAndHumiditySensorRecord delete(Long id) {
	TempAndHumiditySensorRecord record=repository.getOne(id);
	repository.deleteById(id);
	return record;
	}

	@Override
	public List<TempAndHumiditySensorRecord> search(Long serialNumber, Long userId, LocalDateTime before, LocalDateTime after) {	
		return repository.search(serialNumber, userId, before, after);
	}

}
