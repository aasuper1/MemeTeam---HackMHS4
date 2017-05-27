package com.memeteam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
    }

    public void changeContentView(View hello){
        setContentView(R.layout.gamescreen);
    }

    public void changeContentView(View hello){
        setContentView(R.layout.hostscreen);

    public void changeContentView(View hello){
        setContentView(R.layout.joinscreen);
}