package com.example.gridlayout;

import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class Grids {
    private String gTvTextView;
    private CardView gCvCard;
    private View gView;

    public Grids(String gTvTextView) {
        this.gTvTextView = gTvTextView;
        this.gCvCard = gCvCard;
        this.gView = gView;
    }

    public String getgTvTextView() {
        return gTvTextView;
    }

    public CardView getgCvCard() {
        return gCvCard;
    }

    public View getgView() {
        return gView;
    }
}
