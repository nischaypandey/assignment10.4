package com.example.rohitgiri.assignment104;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

//creating a audio fragment class which is extending Fragment class
public class AudioFragment extends Fragment {

    //creating onCreateView Method
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View audioview=inflater.inflate(R.layout.fragment_audio, container, false);          //inflating fragment_audio layout

        //seeting linear layout by it's ID
        LinearLayout audioLayout= (LinearLayout) getActivity().findViewById(R.id.audio_layout);

        audioLayout.setBackgroundColor(getResources().getColor(R.color.ClickedColor));
        return audioview;
    }


    }

