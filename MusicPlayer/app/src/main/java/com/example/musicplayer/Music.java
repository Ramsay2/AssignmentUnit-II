package com.example.musicplayer;

public class Music {
    private String mSongName;
    private int coverImage;

    public Music(String mSongName, int coverImage) {
        this.mSongName = mSongName;
        this.coverImage = coverImage;
    }

    public String getmSongName() {
        return mSongName;
    }

    public int getCoverImage() {
        return coverImage;
    }
}
