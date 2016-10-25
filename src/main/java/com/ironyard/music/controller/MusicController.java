package com.ironyard.music.controller;

import com.ironyard.music.data.Music;
import com.ironyard.music.repositories.MusicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by favianalopez on 10/24/16.
 */
@RestController
public class MusicController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private MusicRepository musicRepository;

    @Autowired
    public void setMusicRepository(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }


    @RequestMapping(value ="/music", method = RequestMethod.POST, produces ="application/json")
    public Music saveMusic (@RequestBody Music aMusic){
        musicRepository.save(aMusic);
        return musicRepository.findOne(aMusic.getId());
    }

    @RequestMapping(value = "/music/update", method = RequestMethod.PUT)
    public Music updateMusic (@RequestBody Music aMusic){
        musicRepository.save(aMusic);
        return musicRepository.findOne(aMusic.getId());
    }

    @RequestMapping(value = "/music/{id}", method = RequestMethod.GET)
    public Music show(@PathVariable Long id){
        return musicRepository.findOne(id);
    }

    @RequestMapping(value = "/musics", method = RequestMethod.GET)
    public Iterable<Music> list(){
        Iterable<Music> list =  null;
        try{
            list = musicRepository.findAll();
        }catch(Throwable x){
            x.printStackTrace();
        }
        log.debug(list.toString());
        log.debug("debug level log");
        log.info("info level log");
        log.error("error level log");
        return list;
    }

    @RequestMapping(value = "/music/delete/{id}", method = RequestMethod.DELETE)
    public Music delete(@PathVariable Long id){
        Music deleted = musicRepository.findOne(id);
        musicRepository.delete(id);
        return deleted;
    }

    @ExceptionHandler(value = Throwable.class)
    public String nfeHandler(Throwable e){
        e.printStackTrace();
        return "Something went wrong :/"+e.getMessage();
    }

}
