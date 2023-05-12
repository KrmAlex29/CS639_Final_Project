package com.example.paceflex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView viewTitle;
    Button goToAccount, viewFunds, viewTheFAQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void viewTitle(View view)
    {
        viewTitle = (TextView) findViewById(R.id.titleView);
    }
    public void viewAccount(View view)
    {
        Button goToAccount = (Button) findViewById(R.id.accountButton);
        startActivity(new Intent(MainActivity.this, StudentAccount.class));
    }

    public void viewFunds(View view)
    {
        Button viewFunds = (Button) findViewById(R.id.addFundsButton);
        startActivity(new Intent(MainActivity.this, AddFunds.class));
    }

    public void viewTheFAQ (View view)
    {
        Button goToFAQ  = (Button) findViewById(R.id.faQButton);
        startActivity(new Intent(MainActivity.this, FAQ.class));

    }


}