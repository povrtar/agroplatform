package com.ftninformatika.jwd.modul3.wafepa.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ftninformatika.jwd.modul3.wafepa.model.SoilSensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.repository.SoilSensorRecordRepository;
import com.ftninformatika.jwd.modul3.wafepa.service.SoilSensorRecordService;


@Service
public class JpaSoilSensorRecordService implements SoilSensorRecordService {
@Autowired
private SoilSensorRecordRepository repository;
	@Override
	public List<SoilSensorRecord> all() {
		
		return repository.findAll();
	}

	@Override
	public Optional<SoilSensorRecord> one(Long id) {
	return repository.findById(id);
	}

	@Override
	public SoilSensorRecord save(SoilSensorRecord record) {
	 return repository.save(record);
	}

	@Override
	public SoilSensorRecord delete(Long id) {
	SoilSensorRecord	record=repository.getOne(id);
		repository.deleteById(id);
		return record;
	}

	@Override
	public List<SoilSensorRecord> byUserId(Long userId) {
		return repository.findByUserId(userId);
	}

	@Override
	public List<SoilSensorRecord> search(Long fieldId, Long serialNumber, Long userId, LocalDateTime before,
			LocalDateTime after) {
		return repository.search(fieldId, serialNumber, userId, before, after);
	}
	
	
}
