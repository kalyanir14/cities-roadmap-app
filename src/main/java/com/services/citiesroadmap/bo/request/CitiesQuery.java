package com.services.citiesroadmap.bo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import javax.ws.rs.QueryParam;

@Setter
@Getter
public class CitiesQuery {
    @QueryParam(value = "origin")
    @ApiModelProperty(value = "origin", required = false)
    private String origin;

    @QueryParam(value = "destination")
    @ApiModelProperty(value = "destination", required = false)
    private String destination;
}
