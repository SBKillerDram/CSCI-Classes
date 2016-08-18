package net.orthus.client;

import android.content.Context;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Chad on 02-May-16.
 */
public class FileServer extends AsyncTask {



    @Override
    protected Object doInBackground(Object[] params) {

        String host = (String) params[0];
        Socket socket = new Socket();

        try {
            socket.bind(null);
            socket.connect(new InetSocketAddress(host, 8888), 500);

            OutputStream outputStream  = socket.getOutputStream();
            outputStream.write(((String)params[1]).getBytes());

            outputStream.close();

        }catch (IOException e){
            e.printStackTrace();
            return null;
        }finally {
            if(socket != null)
                if(socket.isConnected())
                    try{
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
        }

        return null;
    }
}
