package com.esrx.services.medicinecabinet.service.impl;

import com.esrx.services.medicinecabinet.service.model.CitiesRequest;
import org.junit.Test;
import org.mockito.InjectMocks;
import static org.junit.Assert.assertNotNull;

public class CitiesBoImplTest {
    @InjectMocks
    private CitiesBoImpl citiesBoImpl = new CitiesBoImpl();

    @Test
    public void getCitiesConnected() {
        CitiesRequest request = new CitiesRequest();
        request.setOrigin("Newark");
        request.setDestination("Boston");
        String response = citiesBoImpl.getCitiesConnected(request);
        assertNotNull(response);
    }
}
