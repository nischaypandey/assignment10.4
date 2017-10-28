package com.example.rohitgiri.assignment104;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
//creating a class which is extending AppCompatActivity
public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    LinearLayout audiolayout;              //declaring audioLayout
    LinearLayout videolayout;               //declaring videoLayout

   //onCreateMethod
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                             //setting Content view UI
        audiolayout= (LinearLayout) findViewById(R.id.audio_layout);        //setting audio Layout by it's ID
        videolayout= (LinearLayout) findViewById(R.id.video_layout);       //setting video Layout by it's ID
        audiolayout.setOnClickListener(this);                              //setting onClick Listner
        videolayout.setOnClickListener(this);                             //setting onClick Listner
    }
       //OnClick Method
    @Override
    public void onClick(View v) {

        Fragment fragment=null;                                           //creating Fragment object
        audiolayout.setBackgroundColor(getResources().getColor(R.color.NonClicked));  //setting background color
        videolayout.setBackgroundColor(getResources().getColor(R.color.NonClicked));
        if(v.getId()==R.id.audio_layout)                                        //matching ID
        {
            fragment=new AudioFragment();                                        //calling fragment
        }
        if(v.getId()==R.id.video_layout)                                          //matching ID
        {
            fragment=new VideoFragment();                                          //calling fragment
        }
        FragmentManager fragmentManager=getSupportFragmentManager();              //making a fragment Manager object
      android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flcontainer,fragment);                 //fragment transecrion
        fragmentTransaction.commit();                                          //commiting fragment

    }
}
