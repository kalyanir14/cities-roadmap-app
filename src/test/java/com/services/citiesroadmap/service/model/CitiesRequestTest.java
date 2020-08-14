package com.services.citiesroadmap.service.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CitiesRequestTest {
    CitiesRequest request = new CitiesRequest();
    @Test
    public void setOrigin()  {
        request.setOrigin("Newark");
        assertTrue(request.getOrigin() == "Newark");
    }

    @Test
    public void setDestination()  {
        request.setDestination("Test");
        assertTrue(request.getDestination() == "Test");
    }
}
