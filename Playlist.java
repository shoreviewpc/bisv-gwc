package com.gwc.bisv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Playlist {
    public static void main(String[] args) {
        List<Song> myPlaylist = new ArrayList<>();

        // add a list of songs to my Play list
        myPlaylist.add(new Song("To Love You More", "Celine", "Dion"));
        myPlaylist.add(new Song("A new Day Has Come", "Celine", "Dion"));
        myPlaylist.add(new Song("Standby Me", "Tracy", "Chapman"));
        myPlaylist.add(new Song("Tomorrow", "The Cranberries", "The Cranberries"));

        // before sorting by tile
        System.out.println("Before sorting the playlist by title");
        for (Song song: myPlaylist) {
            System.out.println(song.toString());
        }

        Collections.sort(myPlaylist, new Comparator() {
            @Override
            public int compare(Object song1, Object song2) {
                //use instanceof to verify the references are indeed of the type in question
                return ((Song)song1).getTitle()
                        .compareTo(((Song)song2).getTitle());
            }
        });

        System.out.println("After sorting the playlist by title");
        for (Song song: myPlaylist) {
            System.out.println(song.toString());
        }

    }

}
