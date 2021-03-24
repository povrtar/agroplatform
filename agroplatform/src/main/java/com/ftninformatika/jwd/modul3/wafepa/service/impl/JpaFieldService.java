package com.ftninformatika.jwd.modul3.wafepa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.jwd.modul3.wafepa.model.Field;
import com.ftninformatika.jwd.modul3.wafepa.model.User;
import com.ftninformatika.jwd.modul3.wafepa.repository.FieldRepository;
import com.ftninformatika.jwd.modul3.wafepa.service.FieldService;
@Service
public class JpaFieldService implements FieldService {
@Autowired
private FieldRepository fieldRepository;
	@Override
	public List<Field> getByUser(User user) {
	return fieldRepository.findByUserId(user.getId());
	}

	@Override
	public Field save(Field field) {
		return fieldRepository.save(field);
	}

}
