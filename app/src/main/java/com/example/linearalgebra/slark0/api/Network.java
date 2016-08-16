package com.example.linearalgebra.slark0.api;

import android.util.Log;

import com.example.linearalgebra.slark0.model.Model;
import com.example.linearalgebra.slark0.model.MySet;
import com.example.linearalgebra.slark0.model.Item;
import com.example.linearalgebra.slark0.model.RealEpisode;

import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public class Network {
    private final Api api;
    private static final String BASE_URL = "http://feature-code-test.skylark-cms.qa.aws.ostmodern.co.uk:8000";

    public Network() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(message -> Log.i("Bert", "OkHttp: " + message));
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.interceptors().add(interceptor);
        OkHttpClient client = builder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        api = retrofit.create(Api.class);
    }

    public Observable<ArrayList<MySet>> fetchSets() {
        return api.fetchSets().map(Model::getMySets);
    }

    public Observable<RealEpisode> fetchEpisode(Item item){
        return api.fetchEpisode(item.getContentUrl());
    }
}
