package com.services.citiesroadmap.service.impl;

import com.services.citiesroadmap.service.model.CitiesRequest;
import com.services.citiesroadmap.testUtils.MockData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.assertNotNull;


@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class RoadMapAPIAdapterTest {
    @InjectMocks
    private RoadMapAPIAdapter roadMapAPIAdapter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
        roadMapAPIAdapter = null;}
    @Test
    public void getCitiesConnected_happypath() throws Exception {
        CitiesRequest request = MockData.buildCitiesRequest();
        String response= roadMapAPIAdapter.getCitiesConnected(request, "classpath:city.txt");
        assertNotNull(response);
        assertEquals("Yes", "Yes");
    }

    @Test
    public void getCitiesConnected() throws Exception {
        CitiesRequest request = MockData.buildNoCitiesRequest();
        String response= roadMapAPIAdapter.getCitiesConnected(request, "classpath:city.txt");
        assertNotNull(response);
        assertEquals("No", "No");
    }
}
