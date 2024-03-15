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

        for (int i = 0; i < playList.length; i++)
    }
            int up = (1 - startIndex + playList.length) % playList.length;
        int down = (startIndex - 1 + playList.length) % playList.length;
        return Math.min(up, down);
    }
}
}
