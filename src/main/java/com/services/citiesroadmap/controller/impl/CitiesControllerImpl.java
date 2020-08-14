package com.services.citiesroadmap.controller.impl;

import com.services.citiesroadmap.service.model.CitiesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.services.citiesroadmap.service.CitiesBo;
import com.services.citiesroadmap.controller.CitiesController;
import com.services.citiesroadmap.service.request.CitiesQuery;
import com.services.citiesroadmap.controller.transformer.ControllerRequestTransformer;
import com.services.citiesroadmap.common.CitiesRequestValidator;

public class CitiesControllerImpl implements CitiesController {
	@Autowired
	CitiesBo citiesBo;

	@Override
	public String getConnected(CitiesQuery query){
		CitiesRequestValidator.validateCitiesRequest(query);
		CitiesRequest boRequest = ControllerRequestTransformer.buildBoRequest(query);
		String boResponse = citiesBo.getCitiesConnected(boRequest);
		return boResponse;
	}
}
