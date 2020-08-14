package com.services.citiesroadmap.controller;

import com.services.citiesroadmap.services.request.CitiesQuery;
import com.services.citiesroadmap.testUtils.MockData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({ "javax.management.*" })
public class CitiesControllerImplTest {

    @InjectMocks
    private CitiesControllerImpl rsImpl;
        
    @Test
    public void getPrescriptions() throws Exception {
    CitiesQuery boRequest = MockData.buildCitiesQueryRequest();
        String response =  rsImpl.getConnected(boRequest);
        assertNotNull(response);
    }
}
