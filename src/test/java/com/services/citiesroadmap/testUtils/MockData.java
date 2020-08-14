package com.services.citiesroadmap.testUtils;

import com.services.citiesroadmap.service.model.CitiesRequest;
import com.services.citiesroadmap.service.request.CitiesQuery;

public class MockData {

    public static CitiesQuery buildCitiesQueryRequest() {
        CitiesQuery request = new CitiesQuery();
        request.setOrigin("Boston");
        request.setDestination("Newark");
        return request;
    }

    public static CitiesRequest buildCitiesRequest() {
        CitiesRequest request = new CitiesRequest();
        request.setOrigin("Newark");
        request.setDestination("New York");
        return request;
    }

    public static CitiesRequest buildNoCitiesRequest() {
        CitiesRequest request = new CitiesRequest();
        request.setOrigin("Test1");
        request.setDestination("York");
        return request;
    }

}
