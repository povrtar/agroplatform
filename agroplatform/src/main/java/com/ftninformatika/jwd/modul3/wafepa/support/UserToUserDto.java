package com.ftninformatika.jwd.modul3.wafepa.support;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.jwd.modul3.wafepa.model.User;
import com.ftninformatika.jwd.modul3.wafepa.web.dto.UserDto;

@Component
public class UserToUserDto implements Converter<User, UserDto>{

	@Override
	public UserDto convert(User source) {
		UserDto target = new UserDto();
		
		target.setId(source.getId());
		target.setEmail(source.getEmail());
		target.setUsername(source.getUsername());
		
		return target;
	}

	
}
