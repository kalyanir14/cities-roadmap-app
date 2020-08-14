package com.services.citiesroadmap.common;

import com.services.citiesroadmap.service.request.CitiesQuery;
import org.apache.logging.log4j.core.util.Assert;

public class CitiesRequestValidator {
    public static void validateCitiesRequest(CitiesQuery query){
        Assert.isEmpty(query.getOrigin());
        Assert.isEmpty(query.getDestination());
    }
