package com.sandipan.smlayout;
import android.widget.*;
import android.os.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.*;
import android.view.View.*;
import android.view.*;


public class second extends Activity
{
	EditText meal1,meal2,meal3,meal4,meal5,meal6,meal7,meal8,meal9,meal0,depo1,depo2,depo3,depo4,depo5,depo6,depo7,depo8,depo9,depo0;
	Float meal11,meal22,meal33,meal44,meal55,meal66,meal77,meal88,meal99,meal00,
	depo11,depo22,depo33,depo44,depo55,depo66,depo77,depo88,depo99,depo00,
	tot1,tot2,tot3,tot4,tot5,tot6,tot7,tot8,tot9,tot0,
	due1,due2,due3,due4,due5,due6,due7,due8,due9,due0,
	pmrstring1,peststring1;
	TextView totv1,totv2,totv3,totv4,totv5,totv6,totv7,totv8,totv9,totv0,
	duev1,duev2,duev3,duev4,duev5,duev6,duev7,duev8,duev9,duev0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);

		Bundle extras = getIntent().getExtras();
		final String pmrstring = extras.getString("passmrate");
		final String peststring = extras.getString("passest");


		Button fres = (Button) findViewById(R.id.finalresult);  
		fres.setOnClickListener(new OnClickListener()  
			{  
				public void onClick(View v)  
				{  
					try
					{

					float pmrstring1 = Float.parseFloat(pmrstring);
					float peststring1 = Float.parseFloat(peststring);

					meal1 = (EditText) findViewById(R.id.santanumeal);
					meal11 = Float.parseFloat(meal1.getText().toString());
					depo1 = (EditText) findViewById(R.id.santanudepo); 
					depo11 = Float.parseFloat(depo1.getText().toString());
					tot1 = ((pmrstring1 * meal11) + peststring1);
					due1 = (tot1 - depo11);
					totv1=(TextView)findViewById(R.id.santanutot);
					duev1=(TextView)findViewById(R.id.santanudue);
					totv1.setText(String.valueOf("Total:- " +tot1));
					duev1.setText(String.valueOf("Due:- " +due1));

					meal2 = (EditText) findViewById(R.id.sadhanmeal);
					meal22 = Float.parseFloat(meal2.getText().toString());
					depo2 = (EditText) findViewById(R.id.sadhandepo); 
					depo22 = Float.parseFloat(depo2.getText().toString());
					tot2 = ((pmrstring1 * meal22) + peststring1);
					due2 = (tot2 - depo22);
					totv2=(TextView)findViewById(R.id.sadhantot);
					duev2=(TextView)findViewById(R.id.sadhandue);
					totv2.setText(String.valueOf("Total:- " +tot2));
					duev2.setText(String.valueOf("Due:- " +due2));

					meal3 = (EditText) findViewById(R.id.arindammeal);
					meal33 = Float.parseFloat(meal3.getText().toString());
					depo3 = (EditText) findViewById(R.id.arindamdepo); 
					depo33 = Float.parseFloat(depo3.getText().toString());
					tot3 = ((pmrstring1 * meal33) + peststring1);
					due3 = (tot3 - depo33);
					totv3=(TextView)findViewById(R.id.arindamtot);
					duev3=(TextView)findViewById(R.id.arindamdue);
					totv3.setText(String.valueOf("Total:- " +tot3));
					duev3.setText(String.valueOf("Due:- " +due3));

					meal4 = (EditText) findViewById(R.id.sandymeal);
					meal44 = Float.parseFloat(meal4.getText().toString());
					depo4 = (EditText) findViewById(R.id.sandydepo); 
					depo44 = Float.parseFloat(depo4.getText().toString());
					tot4 = ((pmrstring1 * meal44) + peststring1);
					due4 = (tot4 - depo44);
					totv4=(TextView)findViewById(R.id.sandytot);
					duev4=(TextView)findViewById(R.id.sandydue);
					totv4.setText(String.valueOf("Total:- " +tot4));
					duev4.setText(String.valueOf("Due:- " +due4));

					meal5 = (EditText) findViewById(R.id.sabujmeal);
					meal55 = Float.parseFloat(meal5.getText().toString());
					depo5 = (EditText) findViewById(R.id.sabujdepo); 
					depo55 = Float.parseFloat(depo5.getText().toString());
					tot5 = ((pmrstring1 * meal55) + peststring1);
					due5 = (tot5 - depo55);
					totv5=(TextView)findViewById(R.id.sabujtot);
					duev5=(TextView)findViewById(R.id.sabujdue);
					totv5.setText(String.valueOf("Total:- " +tot5));
					duev5.setText(String.valueOf("Due:- " +due5));

					meal6 = (EditText) findViewById(R.id.rohitmeal);
					meal66 = Float.parseFloat(meal6.getText().toString());
					depo6 = (EditText) findViewById(R.id.rohitdepo); 
					depo66 = Float.parseFloat(depo6.getText().toString());
					tot6 = ((pmrstring1 * meal66) + peststring1);
					due6 = (tot6 - depo66);
					totv6=(TextView)findViewById(R.id.rohittot);
					duev6=(TextView)findViewById(R.id.rohitdue);
					totv6.setText(String.valueOf("Total:- " +tot6));
					duev6.setText(String.valueOf("Due:- " +due6));

					meal7 = (EditText) findViewById(R.id.souravmeal);
					meal77 = Float.parseFloat(meal7.getText().toString());
					depo7 = (EditText) findViewById(R.id.souravdepo); 
					depo77 = Float.parseFloat(depo7.getText().toString());
					tot7 = ((pmrstring1 * meal77) + peststring1);
					due7 = (tot7 - depo77);
					totv7=(TextView)findViewById(R.id.souravtot);
					duev7=(TextView)findViewById(R.id.souravdue);
					totv7.setText(String.valueOf("Total:- " +tot7));
					duev7.setText(String.valueOf("Due:- " +due7));

					meal8 = (EditText) findViewById(R.id.subhameal);
					meal88 = Float.parseFloat(meal8.getText().toString());
					depo8 = (EditText) findViewById(R.id.subhadepo); 
					depo88 = Float.parseFloat(depo8.getText().toString());
					tot8 = ((pmrstring1 * meal88) + peststring1);
					due8 = (tot8 - depo88);
					totv8=(TextView)findViewById(R.id.subhatot);
					duev8=(TextView)findViewById(R.id.subhadue);
					totv8.setText(String.valueOf("Total:- " +tot8));
					duev8.setText(String.valueOf("Due:- " +due8));

					meal9 = (EditText) findViewById(R.id.ujjwalmeal);
					meal99 = Float.parseFloat(meal9.getText().toString());
					depo9 = (EditText) findViewById(R.id.ujjwaldepo); 
					depo99 = Float.parseFloat(depo9.getText().toString());
					tot9 = ((pmrstring1 * meal99) + peststring1);
					due9 = (tot9 - depo99);
					totv9=(TextView)findViewById(R.id.ujjwaltot);
					duev9=(TextView)findViewById(R.id.ujjwaldue);
					totv9.setText(String.valueOf("Total:- " +tot9));
					duev9.setText(String.valueOf("Due:- " +due9));

					meal0 = (EditText) findViewById(R.id.samirmeal);
					meal00 = Float.parseFloat(meal0.getText().toString());
					depo0 = (EditText) findViewById(R.id.samirdepo); 
					depo00 = Float.parseFloat(depo0.getText().toString());
					tot0 = ((pmrstring1 * meal00) + peststring1);
					due0 = (tot0 - depo00);
					totv0=(TextView)findViewById(R.id.samirtot);
					duev0=(TextView)findViewById(R.id.samirdue);
					totv0.setText(String.valueOf("Total:- " +tot0));
					duev0.setText(String.valueOf("Due:- " +due0));

					}
					catch(Exception e)  
					{  
						Toast.makeText(getBaseContext(),"ENTER DATA OF ALl MEMBERS",Toast.LENGTH_LONG).show();
					}  
				}}

		);}
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
			Toast.makeText(this, "✋✋Hii..More Marvellous Updates Coming Soon..??", Toast.LENGTH_LONG).show();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }		
}
