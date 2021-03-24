package com.ftninformatika.jwd.modul3.wafepa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.jwd.modul3.wafepa.model.Field;

@Repository
public interface FieldRepository extends JpaRepository<Field,Long>{

	List<Field> findByUserId(Long id);

}
