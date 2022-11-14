package com.registration.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.entity.Tourist;
import com.registration.repository.TouristRepository;
import com.registration.service.TouristService;
@Service
public class TouristServiceImpl implements TouristService {
	@Autowired
	private TouristRepository touristRepository;

	@Override
	public List<Tourist> getAllTourists() {
		
		return touristRepository.findAllByOrderByNameDesc();
	}

	@Override
	public boolean registerTourist(Tourist tourist) {
		touristRepository.save(tourist);
		return true;
	}
	
	

}
