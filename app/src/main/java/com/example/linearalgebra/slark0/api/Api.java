package com.example.linearalgebra.slark0.api;

import com.example.linearalgebra.slark0.model.Model;
import com.example.linearalgebra.slark0.model.RealEpisode;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by LinearAlgebra on 16/08/2016.
 */
public interface Api {
    @GET("api/sets/")
    Observable<Model> fetchSets();

    @GET
    Observable<RealEpisode> fetchEpisode(@Url String url);
}
