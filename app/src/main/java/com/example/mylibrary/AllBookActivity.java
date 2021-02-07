package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
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

        ArrayList<String> books = new ArrayList<>();
        books.addAll(Arrays.asList(new String[]{"DAA", "CN", "DSA", "OS"}));

        }
}
