package com.sandipan.smlayout;

import android.app.*;
import android.os.*;
import android.app.Activity;
import android.os.Bundle;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.widget.Button;  
import android.widget.EditText;  
import android.widget.Toast;
import android.content.*;
import android.content.Intent;
import android.widget.*;
import android.view.View.*;
import android.util.*;
import android.view.*;

public class MainActivity extends Activity {  
    /** Called when the activity is first created. */  
    EditText Data1,Data2,Data3,Data4,Data5,Data6,Data7,passv;
    float num1,num2,num3,num4,num5,num6,num7,result1,result2; 
	TextView viewestch,viewmrate;
	private Button button;
	Button btnpassvalue;
	Intent i;


    @Override  
    public void onCreate(Bundle savedInstanceState)  
    {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.main);



        Button est = (Button) findViewById(R.id.estcharge);  
        est.setOnClickListener(new OnClickListener()  
			{  
				public void onClick(View v)  
				{  
					try
					{
						Data1 = (EditText) findViewById(R.id.others);
						Data2 = (EditText) findViewById(R.id.paper);
						Data3 = (EditText) findViewById(R.id.member);

						num1 = Float.parseFloat(Data1.getText().toString());
						num2 = Float.parseFloat(Data2.getText().toString());
						num3 = Float.parseFloat(Data3.getText().toString());

						result1 = (num1 + num2 + (num3*150))/num3;

						Toast.makeText(getBaseContext(),"ESTABLISHMENT CHARGE: " +result1,Toast.LENGTH_LONG).show();
					}
					catch(Exception e)  
					{  
						Toast.makeText(getBaseContext(), e.getMessage(),  
									   Toast.LENGTH_LONG).show();  
					}  
				}  
			});


		Button rate = (Button) findViewById(R.id.mealrate);  
        rate.setOnClickListener(new OnClickListener()  
			{  
				public void onClick(View v)  
				{  
					try
					{
						Data4 = (EditText) findViewById(R.id.meal);
						Data5 = (EditText) findViewById(R.id.market);
						Data7 = (EditText) findViewById(R.id.riceprice);

						num4 = Float.parseFloat(Data4.getText().toString());
						num5 = Float.parseFloat(Data5.getText().toString());
						num7 = Float.parseFloat(Data7.getText().toString());

						result2 = (num5 + num7)/num4;

						Toast.makeText(getBaseContext(),"MEAL RATE: " +result2,Toast.LENGTH_LONG).show();
					}
					catch(Exception e)  
					{  
						Toast.makeText(getBaseContext(), e.getMessage(),  
									   Toast.LENGTH_LONG).show();  
					}  
				}  
			});


		viewestch=(TextView)findViewById(R.id.view_estch);
		viewmrate=(TextView)findViewById(R.id.view_mrate);

		Button pass = (Button) findViewById(R.id.result);  
		pass.setOnClickListener(new OnClickListener()
			{

				@Override
				public void onClick(View view)
				{

					String str_est = Float.toString(result1);
					viewestch.setText("Establishment Charge :: "+str_est);

					String str_rate = Float.toString(result2);
					viewmrate.setText("Meal Rate :: "+str_rate);}

			});

		btnpassvalue=(Button)findViewById(R.id.pass_second);
		btnpassvalue.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {

					Intent intentpass=new Intent(getApplicationContext(),second.class);
					String passest = Float.toString(result1);
					String passmrate = Float.toString(result2);
					intentpass.putExtra("passmrate",passmrate);
					intentpass.putExtra("passest",passest);
					startActivity(intentpass);}

			});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater menu1= getMenuInflater();
		menu1.inflate(R.menu.option_menu,menu);
// TODO: Implement this method
		return true;
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

		if (id == R.id.item1) {
			Toast.makeText(this, "Developer:- DevSan (Sandipan Bera)", Toast.LENGTH_LONG).show();

            return true;
        }
		if (id == R.id.item2) {
			Toast.makeText(this, "✋✋Hii..More Marvellous Updates Coming Soon..", Toast.LENGTH_LONG).show();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
			
