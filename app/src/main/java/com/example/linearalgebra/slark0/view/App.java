package com.example.linearalgebra.slark0.view;

import android.app.Application;
import android.content.Context;

import com.example.linearalgebra.slark0.api.Network;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public class App extends Application {
    private Network network;

    public static App getInstance(Context context) {
        return (App) context.getApplicationContext();
    }

    public Network getClient() {
        if(network == null) {
            network = new Network();
        }
        return network;
    }
}
