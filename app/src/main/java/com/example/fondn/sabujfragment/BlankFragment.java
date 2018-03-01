package com.example.fondn.sabujfragment;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Sagor","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Sagor","onCreate only");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_blank, container, false);
        Log.d("Sagor","onCreateView");

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Sagor","on Start");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("Sagor","onCreateView created");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Sagor","onActivityCreated ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Sagor","Resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Sagor","On Pause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Sagor","On Destroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Sagor","On Destroy View");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Sagor","on D Attach");
    }

}
