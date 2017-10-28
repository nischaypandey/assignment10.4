package com.example.rohitgiri.assignment104;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

//creating a video fragment class which is extending Fragment class
public class VideoFragment extends Fragment {


    public VideoFragment() {
        // Required empty public constructor
    }

      //onCreateView method
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,              //inflating fragment_audio layout
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View videoView = inflater.inflate(R.layout.fragment_video, container, false);
        //seeting linear layout by it's ID
        LinearLayout videoLayout = (LinearLayout) getActivity().findViewById(R.id.video_layout);
        videoLayout.setBackgroundColor(getResources().getColor(R.color.ClickedColor));
        return videoView;
    }
}

