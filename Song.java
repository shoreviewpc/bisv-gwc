package com.gwc.bisv;

import java.util.Date;

public class Song {
    private String title;
    private String artistFirstName;
    private String artistLastName;

    // Constructors
    public Song(String title, String artistFirstName, String artistLastName) {
        this.title = title;
        this.artistFirstName = artistFirstName;
        this.artistLastName = artistLastName;

    }

    @Override
    public String toString() {
        return "Song {" +
                "title='" + title + '\'' +
                ", artistFirstName='" + artistFirstName + '\'' +
                ", artistLastName='" + artistLastName + '\'' +
                '}';
    }

    // Getters & setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistFirstName() {
        return artistFirstName;
    }

    public void setArtistFirstName(String artistFirstName) {
        this.artistFirstName = artistFirstName;
    }

    public String getArtistLastName() {
        return artistLastName;
    }

    public void setArtistLastName(String artistLastName) {
        this.artistLastName = artistLastName;
    }

    // private String lyrics;
    // private String duration;
}
