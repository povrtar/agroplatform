package com.ftninformatika.jwd.modul3.wafepa.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ftninformatika.jwd.modul3.wafepa.model.TempAndHumiditySensorRecord;
@Repository
public interface TempAndHumiditySensorRecordRepository extends JpaRepository<TempAndHumiditySensorRecord, Long>{
	@Query("SELECT t FROM TempAndHumiditySensorRecord t WHERE "
			+ "(:serialNumber IS NULL or t.serialNumberOfSensor=:serialNumber ) AND "
			+ "(:userId IS NULL or t.user.id=:userId ) AND "
			+ "(:before IS NULL or t.time<:before ) AND "
			+ "(:after IS NULL or t.time>:after ) ")
	List<TempAndHumiditySensorRecord> search(
			@Param("serialNumber")Long serialNumber,
			@Param ("userId") Long userId,
			@Param("before") LocalDateTime before, 
			@Param("after") LocalDateTime after);
}
