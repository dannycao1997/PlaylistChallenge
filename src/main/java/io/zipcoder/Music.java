package io.zipcoder;

// INSTRUCTIONS
//Complete the playlist function in your editor. It has 3 parameters:
//An array of n strings, songs.
// An integer, k, the index of song sk.
// A string, q, the name of the song you wish to switch to.
// It must return an integer denoting the minimum number of button presses needed to switch from song sk to song q.


public class Music { // class name = Music


    // instance fields
    private String[] playList; // String[] n =  music playlist array
    private Integer startIndex; // Integer k = current index/position of song in playlist
    private String selection; // String q =  name of song you want to go in music playlist a

    // EXAMPLE :  String[]playListArray, Integer startIndex, String selection

    public Music(String[] playList) {  // constructor method for initializing
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) { // methods//
        int n = playList.length; // playlist array
        int targetIndex = -1; // target song or index in playlist array

        //Calculating the minimum number of button pressed when going "up" or "down" playlist
        int up = (targetIndex - startIndex + n) % n;
        int down = (startIndex - targetIndex + n) % n;
        return Math.min(up, down);
    }
}

