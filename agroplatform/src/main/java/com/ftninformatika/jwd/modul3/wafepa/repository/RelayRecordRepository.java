package com.ftninformatika.jwd.modul3.wafepa.repository;

import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ftninformatika.jwd.modul3.wafepa.model.RelayRecord;

@Repository
public interface RelayRecordRepository extends JpaRepository<RelayRecord, Long>{
	
	@Query("SELECT r FROM RelayRecord r WHERE r.user.id = :userId "
			+ "and r.serialNumber= :serialNumber "
			+ "and r.time>:after "
			+ "and r.time<:before" )
	List<RelayRecord> search(
			@Param("userId") Long userId,
			@Param("serialNumber") Long serialNumber,
			@Param("after") LocalTime after,
			@Param("before") LocalTime before);
	
	
}
