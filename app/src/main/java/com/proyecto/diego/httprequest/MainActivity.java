package com.proyecto.diego.httprequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String json = "{" +
                        "id: 0," +
                        "city: {" +
                            "id: 1," +
                            "name: 'London'" +
                        "}"+
                    "}";


        Gson gson = new Gson();
        Town town = gson.fromJson(json, Town.class);
        //Toast.makeText(this,town.getId() + "--" + town.getName(),Toast.LENGTH_SHORT).show();
    }
}
