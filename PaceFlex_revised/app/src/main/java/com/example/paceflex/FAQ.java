package com.example.paceflex;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FAQ extends MainActivity {


    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        imageView = (ImageView) findViewById(R.id.faqView);

    }

    public void viewTheFAQ(View view){

        imageView.setImageResource(R.drawable.paceflexfaq);

    }
}
