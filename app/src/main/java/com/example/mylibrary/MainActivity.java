package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSeeBook,btnCurrBook,btnWantBook,btnAlreadyBook,btnAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();
        setOnClickListener();   
    }

    private void setOnClickListener() {
        btnSeeBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initWidget() {

            btnSeeBook = findViewById(R.id.btnAllBooks);
            btnCurrBook = findViewById(R.id.btnCurrentBook);
            btnWantBook = findViewById(R.id.btnWantTo);
            btnAlreadyBook = findViewById(R.id.btnReadBook);
            btnAbout = findViewById(R.id.btnAbout);

    }
}
