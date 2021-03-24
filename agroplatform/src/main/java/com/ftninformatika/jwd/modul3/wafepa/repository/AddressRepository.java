package com.ftninformatika.jwd.modul3.wafepa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.jwd.modul3.wafepa.model.Address;
import com.ftninformatika.jwd.modul3.wafepa.model.User;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

	List<Address> findByUserId(Long userId);
	
	List<Address> findByUser(User user);

}
