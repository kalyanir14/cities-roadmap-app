package com.services.citiesroadmap.bo.impl;

import com.services.citiesroadmap.bo.model.CitiesRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

@Component
public class RoadMapAPIAdapter {
    public String getCitiesConnected(CitiesRequest request){
        String isRoadsConnected = "No";
        File file = null;
        String content = null;
        Set<String> uniqueCities = new HashSet<>();
        try {
            file = ResourceUtils.getFile("classpath:city.txt");
            content = new String(Files.readAllBytes(file.toPath()));
            String delimiter = "\n\t,.;";
            StringTokenizer st = new StringTokenizer(content, delimiter);
            while (st.hasMoreTokens()) {
                uniqueCities.add(st.nextToken().trim());
            }
            if(uniqueCities.contains(request.getOrigin()) && uniqueCities.contains(request.getDestination()))
                isRoadsConnected = "Yes";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isRoadsConnected;
    }
}
