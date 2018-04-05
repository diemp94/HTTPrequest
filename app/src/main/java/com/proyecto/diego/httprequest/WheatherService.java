package com.proyecto.diego.httprequest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by diego on 05/04/18.
 */

public interface WheatherService {
    //forecast?id=524901&appid=b1b15e88fa797225412429c1c50c122a1
    @GET("forecast")
    Call<City> getCity(@Query("id") String city, @Query("appid") String key);
}
