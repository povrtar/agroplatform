package com.ftninformatika.jwd.modul3.wafepa.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.jwd.modul3.wafepa.model.User;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.UserDto;

@Component
public class UserListToUserDtoList implements Converter<List<User>, List<UserDto>>{
	@Autowired
	private UserToUserDto toDto;
	
	@Override
	public List<UserDto> convert(List<User> source) {
		List<UserDto> target = new ArrayList<>();
		
		for(User u : source) {
			UserDto dto = toDto.convert(u);
			target.add(dto);
		}
		
		return target;
	}

}
