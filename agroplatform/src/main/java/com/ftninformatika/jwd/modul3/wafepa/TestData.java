package com.ftninformatika.jwd.modul3.wafepa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import com.ftninformatika.jwd.modul3.wafepa.service.TempAndHumiditySensorRecordService;
import com.ftninformatika.jwd.modul3.wafepa.model.Address;
import com.ftninformatika.jwd.modul3.wafepa.model.SoilSensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.model.TempAndHumiditySensorRecord;
import com.ftninformatika.jwd.modul3.wafepa.model.User;
import com.ftninformatika.jwd.modul3.wafepa.model.UserRole;
import com.ftninformatika.jwd.modul3.wafepa.service.AddressService;
import com.ftninformatika.jwd.modul3.wafepa.service.SoilSensorRecordService;
import com.ftninformatika.jwd.modul3.wafepa.service.UserService;

@Component
public class TestData {

	@Autowired
	private TempAndHumiditySensorRecordService tempRecordService;

	@Autowired
	private UserService userService;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private SoilSensorRecordService soilRecordService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostConstruct
	public void init() {

		List<User> users = new ArrayList<User>();
		for (int i = 1; i <= 3; i++) {
			User user = new User();
			user.setUsername("user" + i);
			user.setEmail("user"+i+"@mail.com");

			// ubacen deo koda zbog greske koja se desavala ako kroz ubacivanje podataka dva puta
			// kriptujemo lozinku
			String encodedPass = passwordEncoder.encode("pass"+i);
			user.setPassword(encodedPass);

			List<UserRole> roles = Arrays.asList(UserRole.values());
			Random random = new Random();
			user.setRole(roles.get(random.nextInt(3)));
			
			users.add(user);
			userService.save(user);
			
			for(int j=1; j<=2; j++) {
				Address a = new Address();
				
				a.setNumber(Integer.toString(j));
				a.setStreet("Laze Nančića");
				
				addressService.save(a);
				
				user.setAddress(a);
				userService.save(user);
				addressService.save(a);
			}
		}
		
	TempAndHumiditySensorRecord tRecord1 = new TempAndHumiditySensorRecord(
			1L,userService.one(1L).get(),21.4,45.5,LocalDateTime.of(2021,3,14,16,22,12,12));
		tempRecordService.save(tRecord1);
		TempAndHumiditySensorRecord tRecord2 = new TempAndHumiditySensorRecord(
				1L,userService.one(2L).get(),23.4,65.5,LocalDateTime.of(2021,3,12,16,22,12,12));
			tempRecordService.save(tRecord2);
			TempAndHumiditySensorRecord tRecord3 = new TempAndHumiditySensorRecord(
					1L,userService.one(1L).get(),27.4,35.5,LocalDateTime.of(2021,3,10,16,22,12,12));
				tempRecordService.save(tRecord3);
			List<TempAndHumiditySensorRecord>tRecords1= new ArrayList<TempAndHumiditySensorRecord>();
			tRecords1.add(tRecord1);
			tRecords1.add(tRecord3);
			List<TempAndHumiditySensorRecord> tRecords2=new ArrayList<TempAndHumiditySensorRecord>();
				tRecords2.add(tRecord2);
			
			
			SoilSensorRecord soilRecord1=new SoilSensorRecord(
						1L,
						userService.one(1L).get(),
						LocalDateTime.of(2021,3,10,16,22,12,1),
						2353255.00,
					54525545.00,
					33.2,
					66.4,
					6.4,
					0.31,
					0.031,
					0.044,0.04);
				soilRecordService.save(soilRecord1);
				SoilSensorRecord soilRecord2=new SoilSensorRecord(
						1L,
						userService.one(1L).get(),
						LocalDateTime.of(2021,3,11,16,22,12,1),
						2353255.00,
					54525545.00,
					33.2,
					66.4,
					6.4,
					0.31,
					0.031,
					0.044,0.04);
				soilRecordService.save(soilRecord2);
				SoilSensorRecord soilRecord3=new SoilSensorRecord(
						1L,
						userService.one(1L).get(),
						LocalDateTime.of(2021,3,12,16,22,12,1),
						2353255.00,
					54525545.00,
					33.2,
					66.4,
					6.4,
					0.31,
					0.031,
					0.044,0.04);
				soilRecordService.save(soilRecord3);
				User user=userService.one(1L).get();
				List <SoilSensorRecord> soilRecords=new ArrayList<>();
				soilRecords.add(soilRecord1);
				soilRecords.add(soilRecord2);
				soilRecords.add(soilRecord3);
				user.setSoilSensorsRecords(soilRecords);
			user.setTempAndHumeditySensorsRecords(tRecords1);
				userService.save(user);
				 user=userService.one(2L).get();
				 user.setTempAndHumeditySensorsRecords(tRecords2);
				 userService.save(user);
	}
}
