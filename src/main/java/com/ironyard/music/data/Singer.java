package com.ironyard.music.data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by favianalopez on 10/24/16.
 */
@Entity
public class Singer {

    private String firstName;
    private String lastName;
    private String artistName;
    private String albumsMade;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Album> albums;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
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
