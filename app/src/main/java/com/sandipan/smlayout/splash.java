package com.sandipan.smlayout;

import android.app.*;
import android.os.*;
import java.util.*;
import android.content.*;
import android.view.View.*;
import android.util.*;
public class splash extends Activity 
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

		Timer time=new Timer();
		time.schedule(new TimerTask(){
				@Override
				public void run()
				{
// TODO: Implement this method
					Intent in=new Intent(splash.this,MainActivity.class);
					startActivity(in);
					finish();
				}},3000);}}
