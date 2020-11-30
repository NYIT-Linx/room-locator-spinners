package com.example.reviews;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class RoomLocator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_locator);

        Spinner Roomspinner = (Spinner) findViewById(R.id.spinnerR);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(RoomLocator.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.buildings));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Roomspinner.setAdapter(myAdapter);

        Roomspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==2){
                    startActivity(new Intent(RoomLocator.this,
                            acct.class));

                }
                if(i==3){
                    startActivity(new Intent(RoomLocator.this,
                            csci.class));
                }
                if(i==4){
                    startActivity(new Intent(RoomLocator.this,
                            etcs.class));
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}