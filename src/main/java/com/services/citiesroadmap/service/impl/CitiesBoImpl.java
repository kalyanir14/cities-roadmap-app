package com.services.citiesroadmap.service.impl;

import com.services.citiesroadmap.service.model.CitiesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.services.citiesroadmap.service.CitiesBo;

public class CitiesBoImpl implements CitiesBo {

    @Autowired
    private RoadMapAPIAdapter roadMapAPIAdapter;

    String filePath = "classpath:city.txt";
    @Override
    public String getCitiesConnected(CitiesRequest request){
        String isConnected =  roadMapAPIAdapter.getCitiesConnected(request, filePath);
        return isConnected;
    }
}
