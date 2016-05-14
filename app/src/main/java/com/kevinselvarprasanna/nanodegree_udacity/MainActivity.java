package com.kevinselvarprasanna.nanodegree_udacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bmov,bhawk,bbig,bappmat,bubiq,bcap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmov = (Button)findViewById(R.id.bmovies);
        bhawk = (Button)findViewById(R.id.bstock);
        bbig = (Button)findViewById(R.id.bbig);
        bappmat= (Button)findViewById(R.id.bappmat);
        bubiq = (Button)findViewById(R.id.bubiquit);
        bcap = (Button)findViewById(R.id.bcapstone);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bmovies:
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies app",Toast.LENGTH_LONG).show();
                break;
            case R.id.bstock:
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk app",Toast.LENGTH_LONG).show();
                break;
            case R.id.bbig:
                Toast.makeText(MainActivity.this, "This button will launch my Build it Bigger app",Toast.LENGTH_LONG).show();
                break;
            case R.id.bappmat:
                Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material app",Toast.LENGTH_LONG).show();
                break;
            case R.id.bubiquit:
                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous app",Toast.LENGTH_LONG).show();
                break;
            case R.id.bcapstone:
                Toast.makeText(MainActivity.this, "This button will launch my Capstone app",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
