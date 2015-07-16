package com.example.al;

import android.app.Activity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class setting extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setting);
		// TODO Auto-generated method stub
		final ImageButton ib = (ImageButton)findViewById(R.id.main4);
        ib.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			switch(v.getId())
			{
			case R.id.main4:
				Intent intent = new Intent(setting.this,MainActivity.class);
				startActivity(intent);
				
				Toast.makeText(getApplicationContext(),"main",Toast.LENGTH_SHORT).show();
				break;
			
			}
			
				
				
			}
			
        });
 
        final ImageButton ib1 = (ImageButton)findViewById(R.id.weekend4);
        ib1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId())
				{
				case R.id.weekend4:
					Intent intent = new Intent(setting.this,weekend.class);
					startActivity(intent);
					
					Toast.makeText(getApplicationContext(),"weekend",Toast.LENGTH_SHORT).show();
					break;
				
				}
			}
        });
        final ImageButton ib2 = (ImageButton)findViewById(R.id.festival4);
        ib2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId())
				{
				case R.id.festival4:
					Intent intent = new Intent(setting.this,festival.class);
					startActivity(intent);
					
					Toast.makeText(getApplicationContext(),"festival",Toast.LENGTH_SHORT).show();
					break;
				
				}
			}
        });
	}

}