package com.anselmo.venues.api;

import com.anselmo.venues.models.VenueReponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Anselmo on 1/17/2018.
 */

public interface VenueService {
    /**
     * This function return a simple callback retrofit.
     *
     * This is very very basic and I don't like to work in this way, but I don't have much time.
     * A good approaching  would be to use a RxAndroid/RxJava and return an Observable and then
     * could do a lot of things with the observable such as: filter results, transform objects, etc.
     *
     */
    @GET("venue")
    Call<VenueReponse> getVenues();
}
