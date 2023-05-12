package com.example.paceflex;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class AddFunds extends MainActivity {

    TextView viewFundsStatement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfunds);
    }

    public void viewFundsStatment(View view) {

        Intent intent = getIntent();
        TextView statementFunds = (TextView) findViewById(R.id.fundsTitleView);

    }
}

