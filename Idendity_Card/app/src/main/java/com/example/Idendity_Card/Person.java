package com.example.Idendity_Card;

import android.media.Image;
import android.widget.ImageView;

public class Person {
private String profession, company,age;


    public Person(String company,String age, String profession) {
        this.age = age;
        this.profession = profession;
        this.company = company;
    }

    public String getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
    public String getCompany(){
        return company;
    }

}
