package com.ftninformatika.jwd.modul3.wafepa.service;

import java.util.List;

import com.ftninformatika.jwd.modul3.wafepa.model.Field;
import com.ftninformatika.jwd.modul3.wafepa.model.User;

public interface FieldService {
public List<Field> getByUser(User user);
public Field save (Field field);

}
