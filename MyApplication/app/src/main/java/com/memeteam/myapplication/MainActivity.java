package com.memeteam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> listAdapter;
    Button connectNew;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
    }

    public void gameContentView(View hello){
        setContentView(R.layout.gamescreen);
    }

    public void hostContentView(View hello){
        setContentView(R.layout.hostscreen);

    public void joinContentView(View hello){
        setContentView(R.layout.joinscreen);
}