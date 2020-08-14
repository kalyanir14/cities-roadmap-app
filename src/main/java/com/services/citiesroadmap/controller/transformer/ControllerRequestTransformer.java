package com.services.citiesroadmap.controller.transformer;

import com.services.citiesroadmap.service.model.CitiesRequest;
import com.services.citiesroadmap.service.request.CitiesQuery;
public class ControllerRequestTransformer {

    private ControllerRequestTransformer(){}

    public static CitiesRequest buildBoRequest(CitiesQuery citiesQuery){
        CitiesRequest citiesRequest = new CitiesRequest();
        citiesRequest.setOrigin(citiesQuery.getOrigin());
        citiesRequest.setDestination(citiesQuery.getDestination());
        return citiesRequest;
    }
}
