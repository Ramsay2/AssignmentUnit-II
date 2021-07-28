package com.example.paytmmallclone;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.smarteist.autoimageslider.SliderView;
import java.util.ArrayList;

public class SliderMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();


        SliderView sliderView = findViewById(R.id.slider);


        sliderDataArrayList.add(new SliderData(R.drawable.first_offer));
        sliderDataArrayList.add(new SliderData(R.drawable.second_offers));
        sliderDataArrayList.add(new SliderData(R.drawable.second_offers));


        SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);


        sliderView.setSliderAdapter(adapter);


        sliderView.setScrollTimeInSec(3);


        sliderView.setAutoCycle(true);


        sliderView.startAutoCycle();
    }
}
