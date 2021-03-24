package com.ftninformatika.jwd.modul3.wafepa.web.controller;

import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ftninformatika.jwd.modul3.wafepa.model.RelayRecord;
import com.ftninformatika.jwd.modul3.wafepa.service.RelayRecordService;
import com.ftninformatika.jwd.modul3.wafepa.support.RelayRecordDtoToRelayRecord;
import com.ftninformatika.jwd.modul3.wafepa.support.RelayRecordToRelayRecordDto;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.RelayRecordDto;

@RestController
@RequestMapping("api/relayRecords")
public class ApiRelayRecordController {

	@Autowired
	private RelayRecordService recordService;
	
	@Autowired
	private RelayRecordToRelayRecordDto toDto;
	@Autowired
	private RelayRecordDtoToRelayRecord toRecord;
	
	@GetMapping
	public ResponseEntity<List<RelayRecordDto>> getAll(
			@RequestParam(required = false) Long userId,
			@RequestParam(required = false) Long serialNumber,
			@RequestParam(required = false) LocalTime after,
			@RequestParam(required = false) LocalTime before
			){
		List<RelayRecord> records;
			records = recordService.search(userId, serialNumber, after, before);
		List<RelayRecordDto> body = toDto.convert(records);
		return new ResponseEntity<>(body, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<RelayRecordDto> add(@RequestBody RelayRecordDto toAdd){
		RelayRecord converted = toRecord.convert(toAdd);
		RelayRecord persisted = recordService.save(converted);
		
		RelayRecordDto body = toDto.convert(persisted);
		return new ResponseEntity<>(body, HttpStatus.CREATED);
	}
}
