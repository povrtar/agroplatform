package com.ftninformatika.jwd.modul3.wafepa.web.controller;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ftninformatika.jwd.modul3.wafepa.model.SoilSensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.service.SoilSensorRecordService;
import com.ftninformatika.jwd.modul3.wafepa.support.SoilSensorRecordDtoToSoilSensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.support.SoilSensorRecordToSoilSensorRecordDto;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.SoilSensorRecordDto;

@RestController
@RequestMapping(value="/api/soilSensorRecords")
public class ApiSoilSensorRecordController {
	@Autowired
	private SoilSensorRecordService recordService;
	
	@Autowired
	private SoilSensorRecordToSoilSensorRecordDto toDTO;
	
	@Autowired
	private SoilSensorRecordDtoToSoilSensorRecord toRecord;
	
	@RequestMapping(method=RequestMethod.GET)
	ResponseEntity<List<SoilSensorRecordDto>> getRecords(
			@RequestParam(required=false) Long serialNumber,
			@RequestParam(required=false) Long userId,
			@RequestParam(required=false) Long fieldId,
			@RequestParam(required=false) LocalDateTime after,
			@RequestParam(required=false) LocalDateTime before){
		
		List<SoilSensorRecord> records= null;
		
		
			records = recordService.search(serialNumber, userId,fieldId,
					after,before);


		HttpHeaders headers = new HttpHeaders();
		
		
		return new ResponseEntity<>(
				toDTO.convert(records),
				headers,
				HttpStatus.OK);
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST,
					consumes="application/json")
	public ResponseEntity<SoilSensorRecordDto> add(
			@Validated @RequestBody SoilSensorRecordDto newRecordDTO){
		
		SoilSensorRecord savedRecord = recordService.save(
				toRecord.convert(newRecordDTO));
		
		return new ResponseEntity<>(
				toDTO.convert(savedRecord), 
				HttpStatus.CREATED);
	}
	
	
	
}
