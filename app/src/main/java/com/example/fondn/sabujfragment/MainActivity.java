package com.example.fondn.sabujfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button one, two;
    FragmentManager fragmentManager;
    BlankFragment blankFragment;
    FillFragment fillFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         blankFragment = new BlankFragment();
         fillFragment = new FillFragment();
        one = (Button) findViewById(R.id.oneButtonID);
        two = (Button) findViewById(R.id.twoButtonID);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "One", Toast.LENGTH_SHORT).show();

                fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragmentContainerID, blankFragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Two", Toast.LENGTH_SHORT).show();
                fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragmentContainerID, fillFragment);
                ft.commit();
            }
        });


    }

}
