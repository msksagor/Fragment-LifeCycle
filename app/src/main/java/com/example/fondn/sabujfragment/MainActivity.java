package com.example.fondn.sabujfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Button one, two,three,four;
    FragmentManager fragmentManager;
    BlankFragment blankFragment;
    FillFragment fillFragment;
    SenderFragment senderFragment;
    ReceiverFragment receiverFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blankFragment = new BlankFragment();
         fillFragment = new FillFragment();
         senderFragment = new SenderFragment();
         receiverFragment = new ReceiverFragment();

        one = (Button) findViewById(R.id.oneButtonID);
        two = (Button) findViewById(R.id.twoButtonID);
        three = (Button) findViewById(R.id.threeButtonID);
        four = (Button) findViewById(R.id.fourButtonID);
        fragmentManager = getFragmentManager();



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

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sender Fragment", Toast.LENGTH_SHORT).show();
                fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragmentContainerID, senderFragment,"s");
                ft.commit();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Receiver Fragment", Toast.LENGTH_SHORT).show();
                fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragmentContainerID, receiverFragment,"r");
                ft.commit();
            }
        });


    }




}
