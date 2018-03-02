package com.example.fondn.sabujfragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ReceiverFragment extends Fragment {
    Communicator communicator;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_receiver, container, false);
        textView = (TextView) view.findViewById(R.id.ResultTextViewID);
        Bundle bundle = getArguments();
        String name = bundle.getString("name");
        textView.setText(name);

        return view;
    }


}
