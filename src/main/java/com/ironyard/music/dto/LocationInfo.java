package com.ironyard.music.dto;

/**
 * Created by favianalopez on 10/26/16.
 */
public class LocationInfo {

    private String latitude;
    private String human_address;
    private boolean needs_recording;
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getHuman_address() {
        return human_address;
    }

    public void setHuman_address(String human_address) {
        this.human_address = human_address;
    }

    public boolean isNeeds_recording() {
        return needs_recording;
    }

    public void setNeeds_recording(boolean needs_recording) {
        this.needs_recording = needs_recording;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
