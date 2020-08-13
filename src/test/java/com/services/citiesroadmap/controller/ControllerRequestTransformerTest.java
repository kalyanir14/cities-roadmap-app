package com.services.citiesroadmap.controller;

import com.services.citiesroadmap.bo.model.CitiesRequest;
import com.services.citiesroadmap.bo.request.CitiesQuery;
import com.services.citiesroadmap.controller.transformer.ControllerRequestTransformer;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerRequestTransformerTest {
    
    @Test
    public void test_buildBoRequest() throws Exception {
        CitiesQuery query = new CitiesQuery();
        
        query.setOrigin("Newark");
        query.setDestination("Boston");

        CitiesRequest request = ControllerRequestTransformer.buildBoRequest(query);
        
        assertNotNull(request);
        assertEquals(request.getOrigin(), query.getOrigin());
        assertEquals(request.getDestination(), query.getDestination());
    }
}
