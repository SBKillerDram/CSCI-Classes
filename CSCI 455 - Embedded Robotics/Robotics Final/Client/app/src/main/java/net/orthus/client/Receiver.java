package net.orthus.client;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.Channel;

/**
 * Created by Chad on 01-May-16.
 */
public class Receiver extends BroadcastReceiver {

    private WifiP2pManager manager;
    private Channel channel;
    private MainActivity activity;
    private WifiP2pManager.PeerListListener peerListListener;
    private WifiP2pDeviceList list;
    private WifiP2pDevice device;
    WifiP2pConfig config;
    Thread sender;
    FileServer server;
    boolean connected;

    String[] buff;

    public Receiver(final WifiP2pManager manager, final Channel channel, final MainActivity activity){
        super();
        this.manager = manager;
        this.channel = channel;
        this.activity = activity;
        this.list = new WifiP2pDeviceList();
        this.config = new WifiP2pConfig();
        this.server = new FileServer();
        buff = new String[2];
        connected = false;


        sender = new Thread(new Runnable() {
            @Override
            public void run() {
                server.doInBackground(buff);
            }
        });


        this.peerListListener = new WifiP2pManager.PeerListListener() {

            @Override
            public void onPeersAvailable(WifiP2pDeviceList peers) {

                if(peers != null && !connected)
                    for(WifiP2pDevice d : peers.getDeviceList())
                        if(d != null) {
                            device = d;
                            config.deviceAddress = d.deviceAddress;
                            activity.connect.setText("Connect to " + device.deviceName);
                            connected = true;
                        }

            }
        };

    }

    public void setIP(String ip){
        buff[0] = ip;
    }

    public void setCmd(String cmd){
        buff[1] = cmd;
    }

    public void connect(){
        manager.connect(channel, config, new WifiP2pManager.ActionListener() {
            @Override
            public void onSuccess() {
                activity.connect.setText("Connected");
                //activity.connect.setEnabled(false);
            }

            @Override
            public void onFailure(int reason) {
                System.out.println("O& Connection failed!");
            }
        });
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();

        if (WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action)) {
            // Check to see if Wi-Fi is enabled and notify appropriate activity
            int state = intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE, -1);

            if (state == WifiP2pManager.WIFI_P2P_STATE_ENABLED) {
                // Wifi P2P is enabled
                System.out.println("O& Wifi Enabled");
            } else {
                // Wi-Fi P2P is not enabled
                System.out.println("O& Wifi Disabled");
            }

        } else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)) {
            // Call WifiP2pManager.requestPeers() to get a list of current peers

            System.out.println("Peers changed!");
            if(manager != null){
                manager.requestPeers(channel, peerListListener);
                peerListListener.onPeersAvailable(list);
            }

        } else if (WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)) {
            // Respond to new connection or disconnections


        } else if (WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)) {
            // Respond to this device's wifi state changing
        }
    }

}
