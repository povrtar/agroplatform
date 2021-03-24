package com.ftninformatika.jwd.modul3.wafepa.repository;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ftninformatika.jwd.modul3.wafepa.model.SoilSensorRecord;

@Repository
public interface SoilSensorRecordRepository extends JpaRepository<SoilSensorRecord, Long>{
@Query("SELECT s from SoilSensorRecord s where s.user.id= :userId " )
	List<SoilSensorRecord> findByUserId(@Param ("userId") Long userId);
	
	@Query("SELECT s FROM SoilSensorRecord s WHERE "
			+ "(:fieldId IS NULL or s.field.id=:fieldId ) AND "
			+ "(:serialNumber IS NULL OR s.serialNumber=:serialNumber) AND "
			+ "(:userId IS NULL or s.user.id=:userId ) AND "
			+ "(:before IS NULL or s.time<:before ) AND "
			+ "(:after IS NULL or s.time>:after ) ")
	List<SoilSensorRecord> search(
			@Param("fieldId") Long fieldId,
			@Param("serialNumber")Long serialNumber,
			@Param ("userId") Long userId,
			@Param("before") LocalDateTime before, 
			@Param("after") LocalDateTime after);
}
