package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class AllBookActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_book);

        recyclerView = (RecyclerView)findViewById(R.id.booksRecyclerview);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Introduction to Algorithmn","T.H.Cormen",999,
                "https://www.flaticon.com/premium-icon/icons/svg/1883/1883213.svg",
                "its complete guide to algorithmn in computer science " +
                        "its the besst book for beginner"));
        books.add(new Book("C programming language","Brian W ",309,
                "https://www.flaticon.com/svg/vstatic/svg/3627/3627782.svg?token=exp=1612771064~hmac=09d20a334b81fc66b9f32459a407d5b7",
                "It is user friendly for beginner to learn programming language " +
                        "its the besst book for beginner"));
        books.add(new Book("Operating System","Galvin",900,
                "https://www.flaticon.com/premium-icon/icons/svg/2397/2397763.svg",
                "all concepts of operrating system and  " +
                        "its the besst book for beginner"));
        books.add(new Book("Computer Networks","Andrew S. Tanenbaum and David J. Wetherall",
                1000,"https://www.flaticon.com/premium-icon/icons/svg/2997/2997464.svg",
                "Core concept of Data communication and computer network " +
                        "its the besst book for beginner"));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(books,AllBookActivity.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

}
