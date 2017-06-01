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

    Button sButton;
    EditText sEdit;
    EditText nameBox;
    int numPlayers;
    String playerNames[];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joinscreen);
        numPlayers();
    }


    public void numPlayers(){
        sButton = (Button)findViewById(R.id.readyButton);
        sButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sEdit = (EditText)findViewById(R.id.numOfPlayers);
                numPlayers = Integer.parseInt(sEdit.getText().toString());
                if (numPlayers > 10 || numPlayers < 3){
                    numPlayers();
                }
                else {
                    initNames();
                }
            }
        });
    }


   // mText = (TextView)findViewById(R.id.textView1);
     //   		mText.setText("Welcome "+mEdit.getText().toString()+"!");


    public void initNames(){
        setContentView(R.layout.names);
        nameBox = (EditText) findViewById(R.id.nameBox);
        TextView prompt = (TextView)findViewById(R.id.promptNameEnter);
        final Button next = (Button)findViewById(R.id.next);
        for(int x = 0; x < numPlayers; x++){
            prompt.setText("Player " + (x+1) + " enter your name");
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