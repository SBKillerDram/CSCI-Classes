package net.orthus.server;

import android.content.Context;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Chad on 02-May-16.
 */
public class FileServer extends AsyncTask {

    int input;


    @Override
    protected Object doInBackground(Object[] params) {

        try{

            ServerSocket serverSocket = new ServerSocket(8888);
            Socket client = serverSocket.accept();

            InputStream inputStream = client.getInputStream();
            input = inputStream.read();

            serverSocket.close();

            return input;

        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }
}
