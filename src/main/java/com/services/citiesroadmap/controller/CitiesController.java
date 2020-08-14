package com.services.citiesroadmap.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.services.citiesroadmap.service.request.CitiesQuery;
import org.springframework.web.bind.annotation.RestController;

@Path("/")
@Api(value = "cities-roadmap")
@RequestMapping(value = "/")
@SwaggerDefinition
@RestController
public interface CitiesController {

    @GET
    @GetMapping("/connected")
    @Path("/connected")
    @Produces(MediaType.APPLICATION_JSON)
    public String getConnected(@ApiParam(value = "CitiesQuery",
            hidden=false, required=true) @Valid @BeanParam CitiesQuery query);
}
