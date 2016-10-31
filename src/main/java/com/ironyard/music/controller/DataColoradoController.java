package com.ironyard.music.controller;

import com.ironyard.music.dto.DataColorado;
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
public class DataColoradoController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping( value="/service/datacolorado", method= RequestMethod.GET)
    public Iterable<DataColorado> listDataColorado (@RequestParam(value ="filter",required= false)String filter){
        log.debug("Request to list geographic locations.");
        RestTemplate restTemplate = new RestTemplate();
        DataColorado[] dataColorado = restTemplate.getForObject("http://data.colorado.gov/resource/4ykn-tg5h.json", DataColorado[].class);
        log.info(dataColorado.toString()) ;
        log.debug("Get Colorado Data");
        List<DataColorado> foundAllList = Arrays.asList(dataColorado);
        List<DataColorado> filteredList = new ArrayList<>();


        if(filter != null){
            //filter the list
            for(DataColorado aLocation: foundAllList){
                if (aLocation.getEntitystatus().startsWith(filter)){
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
