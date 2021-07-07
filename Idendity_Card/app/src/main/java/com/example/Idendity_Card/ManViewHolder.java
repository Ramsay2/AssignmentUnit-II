package com.example.Idendity_Card;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animaldetails.R;

public class ManViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvAge, mTvProfession, mTvCompany;
    private ImageView mTvPhoto;

    public ManViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvProfession = itemView.findViewById(R.id.tvProfession);
        mTvPhoto = itemView.findViewById(R.id.imageView);
        mTvCompany = itemView.findViewById(R.id.tvBusinessName);
    }

    public void setData(Person person) {
        mTvAge.setText(person.getAge());
        mTvProfession.setText(person.getProfession());
        mTvCompany.setText(person.getCompany());
    }

    public void setArticleList(Article article) {
        mTvPhoto.setBackgroundResource(article.getImageId());

    }
}
