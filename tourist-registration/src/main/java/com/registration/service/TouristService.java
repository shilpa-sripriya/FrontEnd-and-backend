package com.registration.service;

import java.util.List;

import com.registration.entity.Tourist;

public interface TouristService {

	List<Tourist> getAllTourists();

	boolean registerTourist(Tourist tourist);

}
