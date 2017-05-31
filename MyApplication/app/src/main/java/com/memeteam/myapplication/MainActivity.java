package com.memeteam.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity{

    int numPlayers;
    String playerNames[];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joinscreen);
    }
/*
    public void numPlayers3(View view){
        numPlayers=3;
        setContentView(R.layout.names);
    }
    public void numPlayers4(View view){
        numPlayers=4;
        setContentView(R.layout.names);
    }
    public void numPlayers5(View view){
        numPlayers=5;
        setContentView(R.layout.names);
    }
    public void numPlayers6(View view){
        numPlayers=6;
        setContentView(R.layout.names);
    }
    public void numPlayers7(View view){
        numPlayers=7;
        setContentView(R.layout.names);
    }
    public void numPlayers8(View view){
        numPlayers=8;
        setContentView(R.layout.names);
    }
    public void numPlayers9(View view){
        numPlayers=9;
        setContentView(R.layout.names);
    }
    public void numPlayers10(View view){
        numPlayers=10;
        setContentView(R.layout.names);
        LinearLayout main = (LinearLayout) findViewById(R.id.namesLayout);
        ImageView meme;
        meme = new ImageView(this);
        meme.setImageResource(R.drawable.aa_does_not_simply);
        main.addView(meme);
    }*/

    public void numPlayers(){
        final EditText numOfPlayers = (EditText) findViewById(R.id.numOfPlayers);
        final Button readyButton = (Button)findViewById(R.id.readyButton);
        View.OnClickListener waitForNum = new View.OnClickListener() {
            public void onClick(View v) {
                if(v == readyButton){
                    String value= numOfPlayers.getText().toString();
                    numPlayers = Integer.parseInt(value);
                }
            }
        };
        setContentView(R.layout.names);
    }
    public void initNames(){
        final EditText nameBox = (EditText) findViewById(R.id.nameBox);
        TextView prompt = (TextView)findViewById(R.id.promptNameEnter);
        final Button next = (Button)findViewById(R.id.next);
        for(int x = 0; x < numPlayers; x++){
            prompt.setText("Player" + (x+1) + "enter your name");
            final int finalX = x;
            View.OnClickListener waitForName = new View.OnClickListener() {
                public void onClick(View v) {
                    if(v == next){
                        playerNames[finalX] = String.valueOf(nameBox.getText());
                    }
                }
            };
        }
    }

}