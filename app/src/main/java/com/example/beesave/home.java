package com.example.beesave;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    ArrayList<senor> sensorList = new ArrayList<>();
    ImageView imgSensor,logout;
    FirebaseAuth mAuth;
    int i;
    ImageView img2;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser == null){
            startActivity(new Intent(getApplicationContext(),home.class));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logout = findViewById(R.id.logout);

        mAuth = FirebaseAuth.getInstance();

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


        sensorList.add(new senor(("001"),"c1",true));
        sensorList.add(new senor(("002"),"c2",true));
        sensorList.add(new senor(("003"),"c3",false));
        sensorList.add(new senor(("004"),"c4",true));
        sensorList.add(new senor(("005"),"c5",false));
        sensorList.add(new senor(("006"),"c6",false));
        sensorList.add(new senor(("007"),"c7",true));
        sensorList.add(new senor(("008"),"c8",true));
        sensorList.add(new senor(("009"),"c9",true));

        for (i=0;i<sensorList.size();i++)
        {
            if (sensorList.get(i).getEtatSensor()==false)
            {
                int resID = getResources().getIdentifier(sensorList.get(i).getNameSensor(), "id", getPackageName());
                imgSensor = findViewById(resID);
                imgSensor.setImageResource(R.drawable.sensorfalse);
            }

        }






    }
}