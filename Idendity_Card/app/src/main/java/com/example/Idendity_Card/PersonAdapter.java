package com.example.Idendity_Card;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animaldetails.R;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<ManViewHolder> {
    private ArrayList<Person> personList;
    private ArrayList<Article> articleList;

    public PersonAdapter(ArrayList<Person> personList, ArrayList<Article> articleList) {
        this.personList = personList;
        this.articleList = articleList;
    }

    @Override
    public ManViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new ManViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ManViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.setData(person);
        Article article = articleList.get(position);
        holder.setArticleList(article);

    }

    @Override
    public int getItemCount() {
        return personList.size();

    }
}
