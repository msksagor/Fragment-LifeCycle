package com.example.fondn.sabujfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Communicator {

    private Button three, four;
    FragmentManager fragmentManager;
    SenderFragment senderFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        senderFragment = new SenderFragment();

        three = (Button) findViewById(R.id.threeButtonID);
        four = (Button) findViewById(R.id.fourButtonID);
        fragmentManager = getFragmentManager();


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sender Fragment", Toast.LENGTH_SHORT).show();
                fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragmentContainerID, senderFragment);
                ft.commit();
            }
        });


    }


    @Override
    public void DataChanger(String data) {
        fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ReceiverFragment receiverFragment = new ReceiverFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", data);
        receiverFragment.setArguments(bundle);
        ft.replace(R.id.fragmentContainerID, receiverFragment);
        ft.commit();


    }
}
