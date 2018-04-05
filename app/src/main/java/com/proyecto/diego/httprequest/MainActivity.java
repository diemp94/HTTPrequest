package com.proyecto.diego.httprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://samples.openweathermap.org/data/2.5/").build();

        WheatherService service = retrofit.create(WheatherService.class);


        Call<City> cityCall = service.getCity("524901","b1b15e88fa797225412429c1c50c122a1");

    }
}
