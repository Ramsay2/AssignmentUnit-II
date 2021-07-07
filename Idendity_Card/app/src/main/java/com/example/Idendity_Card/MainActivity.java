package com.example.Idendity_Card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.animaldetails.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Person> personList;
    private ArrayList<Article> articleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildPersonList();
        setRecyclerView();
        Article article = new Article(R.drawable.bill_gates);
        articleList.add(article);

        Article article1 = new Article(R.drawable.image0);
        articleList.add(article1);

        Article article2 = new Article(R.drawable.image1);
        articleList.add(article2);

        Article article3 = new Article(R.drawable.image2);
        articleList.add(article3);

        Article article4 = new Article(R.drawable.image3);
        articleList.add(article4);

        Article article5 = new Article(R.drawable.image4);
        articleList.add(article5);

        Article article6 = new Article(R.drawable.image5);
        articleList.add(article6);

        Article article7 = new Article(R.drawable.image6);
        articleList.add(article7);

        Article article8 = new Article(R.drawable.image7);
        articleList.add(article8);

        Article article9 = new Article(R.drawable.image8);
        articleList.add(article9);

        Article article10 = new Article(R.drawable.image9);
        articleList.add(article10);

    }

    private void setRecyclerView() {
        PersonAdapter personAdapter = new PersonAdapter(personList, articleList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(personAdapter);

    }

    private void buildPersonList() {
        personList = new ArrayList<>();
        Person person1 = new Person("Microsoft", "Age: 65", "Profession: Business");
        personList.add(person1);

        Person person2 = new Person("Amazon", "Age: 57", "Profession: Business");
        personList.add(person2);

        Person person3 = new Person("Masai", "Age: 31", "Profession: Business");
        personList.add(person3);

        Person person4 = new Person("Masai", "Age: 32", "Profession: Teacher");
        personList.add(person4);

        Person person5 = new Person("Masai", "Age: 28", "Profession: Teacher");
        personList.add(person5);

        Person person6 = new Person("Tesla", "Age: 52", "Profession: Business");
        personList.add(person6);

        Person person7 = new Person("Inverter", "In Heaven", "Profession: Math");
        personList.add(person7);

        Person person8 = new Person("Actor", "Age: 48", "Profession: Actor");
        personList.add(person8);

        Person person9 = new Person("Java Inventor", "Age: 66", "Profession: Business");
        personList.add(person9);

        Person person10 = new Person("Google", "Age: 50", "Profession: Business");
        personList.add(person10);

        Person person11 = new Person("Microsoft", "Age: 64", "Profession: Business");
        personList.add(person11);

    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}