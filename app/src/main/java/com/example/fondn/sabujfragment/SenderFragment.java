package com.example.fondn.sabujfragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SenderFragment extends Fragment {
    EditText editText;
    Button button;
    Communicator communicator;
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sender, container, false);

        editText = (EditText) view.findViewById(R.id.editTextID);
        button = (Button) view.findViewById(R.id.buttonID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m = editText.getText().toString();
                communicator.DataChanger(m);

                Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicator = (Communicator) context;


    }
}
