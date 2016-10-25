package com.ironyard.music.controller;

import com.ironyard.music.data.Singer;
import com.ironyard.music.repositories.SingerRepository;
import com.ironyard.music.repositories.SingerSortingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

/**
 * Created by favianalopez on 10/24/16.
 */
@RestController
public class SingerController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private SingerRepository singerRepository;
    private SingerSortingRepository singerSortingRepository;


    @Autowired
    public void setSingerRepository(SingerRepository singerRepository) {
        this.singerRepository = singerRepository;
    }

    @Autowired
    public void setSingerSortingRepository(SingerSortingRepository singerSortingRepository){
        this.singerSortingRepository = singerSortingRepository;
    }


    @RequestMapping(value ="/singer", method = RequestMethod.POST, produces ="application/json")
    public Singer saveSinger (@RequestBody Singer aSinger){
        singerRepository.save(aSinger);
        return singerRepository.findOne(aSinger.getId());
    }

    @RequestMapping(value = "/singer/update", method = RequestMethod.PUT)
    public Singer updateSinger (@RequestBody Singer aSinger){
        singerRepository.save(aSinger);
        return singerRepository.findOne(aSinger.getId());
    }

    @RequestMapping(value = "/singer/{id}", method = RequestMethod.GET)
    public Singer showSinger(@PathVariable Long id){
        return singerRepository.findOne(id);
    }

    @RequestMapping(value = "/singers", method = RequestMethod.GET)
    public Iterable<Singer> listSingers(@RequestParam (value = "page") Integer page,
                                        @RequestParam ("size") Integer size,
                                        @RequestParam (value = "sortby", required = false) String sortby,
                                        @RequestParam (value = "direction", required = false) Sort.Direction direction){
        Iterable<Singer> list =  null;

        if(sortby==null){
            sortby = "artistName";
        }

        if(direction == null){
            direction = Sort.Direction.ASC;
        }

        Sort sort = new Sort(direction, sortby);
        PageRequest pr =new PageRequest(page, size, sort);
        list = singerSortingRepository.findAll(pr);

        try{
            list = singerRepository.findAll();
        }catch(Throwable x){
            x.printStackTrace();
        }
        log.debug(list.toString());
        log.debug("debug level log");
        log.info("info level log");
        log.error("error level log");
        return list;
    }

    @RequestMapping(value = "/singer/delete/{id}", method = RequestMethod.DELETE)
    public Singer deleteSinger(@PathVariable Long id){
        Singer deleted = singerRepository.findOne(id);
        singerRepository.delete(id);
        return deleted;
    }

    @ExceptionHandler(value = Throwable.class)
    public String nfeHandler(Throwable e){
        e.printStackTrace();
        return "Something went wrong :/"+e.getMessage();
    }

}
