package net.orthus.client;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Receiver receiver;
    WifiP2pManager manager;
    WifiP2pManager.Channel channel;
    IntentFilter intentFilter;

    Button discover, connect,
            forward, left, right, reverse, stop,
            save, start;
    EditText ipIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = (WifiP2pManager) getSystemService(Context.WIFI_P2P_SERVICE);
        channel = manager.initialize(this, getMainLooper(), null);
        receiver = new Receiver(manager, channel, this);

        intentFilter = new IntentFilter();
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION);
        intentFilter.addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION);

        discover = (Button) findViewById(R.id.discover);
        connect = (Button) findViewById(R.id.connect);
        forward = (Button) findViewById(R.id.forward);
        left = (Button) findViewById(R.id.left);
        right = (Button) findViewById(R.id.right);
        reverse = (Button) findViewById(R.id.reverse);
        stop = (Button) findViewById(R.id.stop);
        save = (Button) findViewById(R.id.target);
        start = (Button) findViewById(R.id.start);


        discover.setOnClickListener(this);
        connect.setOnClickListener(this);
        forward.setOnClickListener(this);
        left.setOnClickListener(this);
        right.setOnClickListener(this);
        reverse.setOnClickListener(this);
        stop.setOnClickListener(this);
        save.setOnClickListener(this);
        start.setOnClickListener(this);

        ipIn = (EditText) findViewById(R.id.ipaddress);


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

    }

    // register the broadcast receiver with the intent values to be matched
    @Override
    protected void onResume(){
        super.onResume();
        registerReceiver(receiver, intentFilter);
    }

    // unregister the broadcast receiver
    @Override
    protected void onPause(){
        super.onPause();
        unregisterReceiver(receiver);
    }

    private void discover(){
        manager.discoverPeers(channel, new WifiP2pManager.ActionListener() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onFailure(int reason) {

            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.discover:
                discover();
                break;

            case R.id.connect:
                receiver.connect();
                break;


            case R.id.forward:
                receiver.setIP(ipIn.getText().toString());
                receiver.setCmd("w");
                receiver.sender.run();
                break;

            case R.id.reverse:
                receiver.setIP(ipIn.getText().toString());
                receiver.setCmd("x");
                receiver.sender.run();
                break;

            case R.id.left:
                receiver.setIP(ipIn.getText().toString());
                receiver.setCmd("a");
                receiver.sender.run();
                break;

            case R.id.right:
                receiver.setIP(ipIn.getText().toString());
                receiver.setCmd("d");
                receiver.sender.run();
                break;

            case R.id.stop:
                receiver.setIP(ipIn.getText().toString());
                receiver.setCmd("s");
                receiver.sender.run();
                break;

            case R.id.target:
                receiver.setIP(ipIn.getText().toString());
                receiver.setCmd("t");
                receiver.sender.run();
                break;

            case R.id.start:
                receiver.setIP(ipIn.getText().toString());
                receiver.setCmd("g");
                receiver.sender.run();
                break;

        }
    }
}
