package com.services.citiesroadmap.service.model;
import lombok.Getter;
import lombok.Setter;
import javax.ws.rs.QueryParam;

@Setter
@Getter
public class CitiesRequest{

    @QueryParam(value = "origin")
    private String origin;

    @QueryParam(value = "destination")
    private String destination;
}
