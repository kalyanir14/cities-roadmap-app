package com.services.citiesroadmap.common;

import com.services.citiesroadmap.bo.request.CitiesQuery;
import org.springframework.util.StringUtils;

public class CitiesRequestValidator {
    public static void validateCitiesRequest(CitiesQuery query){
        AssertionError(StringUtils.isEmpty(query.getOrigin()));
        AssertionError(StringUtils.isEmpty(query.getDestination()));
    }
}
