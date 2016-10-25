package com.ironyard.music.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by favianalopez on 10/24/16.
 */
@Entity
public class Album {

    private String revenue;
    private String numberOfCopiesSold;
    private String albumPrice;
    private String albumName;
    private Date releaseDate;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getNumberOfCopiesSold() {
        return numberOfCopiesSold;
    }

    public void setNumberOfCopiesSold(String numberOfCopiesSold) {
        this.numberOfCopiesSold = numberOfCopiesSold;
    }

    public String getAlbumPrice() {
        return albumPrice;
    }

    public void setAlbumPrice(String albumPrice) {
        this.albumPrice = albumPrice;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
