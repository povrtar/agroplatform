package com.ftninformatika.jwd.modul3.wafepa.web.controller;

import java.time.LocalDateTime;
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
import com.ftninformatika.jwd.modul3.wafepa.model.TempAndHumiditySensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.service.TempAndHumiditySensorRecordService;
import com.ftninformatika.jwd.modul3.wafepa.support.TempAndHumiditySensorRecordDtoToTempAndHumiditySensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.support.TempAndHumiditySensorRecordToTempAndHumiditySensorRecordDto;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.TempAndHumiditySensorRecordDto;

@RestController
@RequestMapping("api/tempAndHumiditySensorRecords")
public class ApiTempAndHumiditySensorRecordController {

	@Autowired
	private TempAndHumiditySensorRecordService recordService;
	
	@Autowired
	private TempAndHumiditySensorRecordToTempAndHumiditySensorRecordDto toDto;
	@Autowired
	private TempAndHumiditySensorRecordDtoToTempAndHumiditySensorRecord toRecord;
	
	@GetMapping
	public ResponseEntity<List<TempAndHumiditySensorRecordDto>> getAll(
			@RequestParam(required = false) Long serialNumber,
			@RequestParam(required = false) Long userId,
			@RequestParam(required = false) LocalDateTime after,
			@RequestParam(required = false) LocalDateTime before
			){
		List<TempAndHumiditySensorRecord> records;
			records = recordService.search(serialNumber, userId, before, after);
		List<TempAndHumiditySensorRecordDto> body = toDto.convert(records);
		
		return new ResponseEntity<>(body, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<TempAndHumiditySensorRecordDto> add(@RequestBody TempAndHumiditySensorRecordDto toAdd){
		TempAndHumiditySensorRecord converted = toRecord.convert(toAdd);
		TempAndHumiditySensorRecord persisted = recordService.save(converted);
		
		TempAndHumiditySensorRecordDto body = toDto.convert(persisted);
		return new ResponseEntity<>(body, HttpStatus.CREATED);
	}
}
