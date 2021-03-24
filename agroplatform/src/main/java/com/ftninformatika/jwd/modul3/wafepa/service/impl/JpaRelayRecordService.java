package com.ftninformatika.jwd.modul3.wafepa.service.impl;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ftninformatika.jwd.modul3.wafepa.model.RelayRecord;
import com.ftninformatika.jwd.modul3.wafepa.repository.RelayRecordRepository;
import com.ftninformatika.jwd.modul3.wafepa.service.RelayRecordService;
@Service
public class JpaRelayRecordService implements RelayRecordService {
@Autowired
private RelayRecordRepository repository;

@Override
public List<RelayRecord> all() {
return repository.findAll();
}

@Override
public Optional<RelayRecord> one(Long id) {
	return repository.findById(id);
}

@Override
public RelayRecord save(RelayRecord record) {
return repository.save(record);
}

@Override
public RelayRecord delete(Long id) {
	RelayRecord record=repository.getOne(id);
	repository.deleteById(id);
	return record;
}

@Override
public List<RelayRecord> search(Long userId, Long serialNumber, LocalTime after, LocalTime before) {
	return repository.search(userId, serialNumber, after, before);
}


	
}
