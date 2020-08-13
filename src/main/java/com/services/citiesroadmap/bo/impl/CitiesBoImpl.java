package com.services.citiesroadmap.bo.impl;

import com.services.citiesroadmap.bo.model.CitiesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.services.citiesroadmap.bo.CitiesBo;

public class CitiesBoImpl implements CitiesBo {

    @Autowired
    private RoadMapAPIAdapter roadMapAPIAdapter;

    @Override
    public String getCitiesConnected(CitiesRequest request){
        String isConnected =  roadMapAPIAdapter.getCitiesConnected(request);
        return isConnected;
    }
}
