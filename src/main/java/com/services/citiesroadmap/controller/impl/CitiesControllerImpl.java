package com.services.citiesroadmap.controller.impl;

import com.services.citiesroadmap.bo.model.CitiesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.services.citiesroadmap.bo.CitiesBo;
import com.services.citiesroadmap.controller.CitiesController;
import com.services.citiesroadmap.bo.request.CitiesQuery;
import com.services.citiesroadmap.controller.transformer.ControllerRequestTransformer;

public class CitiesControllerImpl implements CitiesController {
	@Autowired
	CitiesBo citiesBo;

	@Override
	public String getConnected(CitiesQuery query){
		CitiesRequest boRequest = ControllerRequestTransformer.buildBoRequest(query);
		String boResponse = citiesBo.getCitiesConnected(boRequest);
		return boResponse;
	}
}
