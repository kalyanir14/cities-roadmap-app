package com.services.citiesroadmap.common;

import com.services.citiesroadmap.service.request.CitiesQuery;
import org.junit.Test;

public class CitiesRequestValidatorTest {
    @Test
    public void validateCitiesRequest() throws Exception {
      CitiesQuery query = new CitiesQuery();
        query.setOrigin("Test1");
        query.setDestination("Test2");
        CitiesRequestValidator.validateCitiesRequest(query);
    }
}
