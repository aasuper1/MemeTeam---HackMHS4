package com.memeteam.myapplication;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> listAdapter;
    Button connectNew;
    ListView listView;
    BluetoothAdapter btAdapter;
    Set<BluetoothDevice> devicesArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        init();
        if(btAdapter==null){
            Toast.makeText(getApplicationContext(), "No bluetooth detected", 0).show();
            finish();
        }
        else{
            if(!btAdapter.isEnabled()){
                Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(intent, 1);
            }

            getPairedDevices();
        }
    }

    private void getPairedDevices() {
        ddevicesArray - btAdapter.getBondedDevices();
        if(devicesArray.size()>0)
    }

    private void init() {
        connectNew=(Button)findViewById(R.id.bConnectNew);
        listView=(ListView)findViewById(R.id.listView);
        listAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,0);
        listView.setAdapter(listAdapter);
        btAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_CANCELLED){
            Toast.makeText(getApplicationContext(), "Bluetooth must be enabled to continue", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    public void gameContentView(View hello){
        setContentView(R.layout.gamescreen);
    }

    public void hostContentView(View hello) {
        setContentView(R.layout.hostscreen);
    }
    public void joinContentView(View hello){
        setContentView(R.layout.joinscreen);
    }
}