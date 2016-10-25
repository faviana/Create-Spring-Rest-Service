package com.ironyard.music.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by favianalopez on 10/24/16.
 */
@Entity
public class Singer {

    private String name;
    private String albumsMade;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbumsMade() {
        return albumsMade;
    }

    public void setAlbumsMade(String albumsMade) {
        this.albumsMade = albumsMade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
