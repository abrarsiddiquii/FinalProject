package com.example.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

public class page_2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.next2);

        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent nextPage = new Intent(page_2.this, page_3.class);
                                          page_2.this.startActivity(nextPage);
                                      }
        });
        Button button2 = (Button) findViewById(R.id.back);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(page_2.this, page_3.class);
                page_2.this.startActivity(nextPage);
            }

        });
    }
}

