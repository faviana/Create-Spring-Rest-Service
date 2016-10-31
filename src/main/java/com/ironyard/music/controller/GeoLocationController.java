package com.ironyard.music.controller;

import com.ironyard.music.dto.GeoLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by favianalopez on 10/26/16.
 */
@RestController
public class GeoLocationController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping( value="/service/geolocation", method= RequestMethod.GET)
    public Iterable<GeoLocation> listGeoLocation (@RequestParam(value ="filter",required= false)String filter){
        log.debug("Request to list geographic locations.");
        RestTemplate restTemplate = new RestTemplate();
        GeoLocation[] geoLocations = restTemplate.getForObject("http://ip-api.com/docs/api:json", GeoLocation[].class);
        log.info(geoLocations.toString()) ;
        log.debug("Get Geographic Location");
        List<GeoLocation> foundAllList = Arrays.asList(geoLocations);
        List<GeoLocation> filteredList = new ArrayList<>();


        if(filter != null){
            //filter the list
            for(GeoLocation aLocation: foundAllList){
                if (aLocation.getCountry().startsWith(filter)){
                    filteredList.add(aLocation);
                }
            }
        }else{
            //just return all
            filteredList = foundAllList;
        }

        return filteredList;


    }



}
