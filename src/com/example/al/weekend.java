package com.example.al;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class weekend extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weekendview);
		// TODO Auto-generated method stub
		final ImageButton ib = (ImageButton)findViewById(R.id.main2);
        ib.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			switch(v.getId())
			{
			case R.id.main2:
				Intent intent = new Intent(weekend.this,MainActivity.class);
				startActivity(intent);
				
				Toast.makeText(getApplicationContext(),"weekend",Toast.LENGTH_SHORT).show();
				break;
			
			}
			
				
				
			}
			
        });
 
        final ImageButton ib1 = (ImageButton)findViewById(R.id.festival2);
        ib1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId())
				{
				case R.id.festival2:
					Intent intent = new Intent(weekend.this,festival.class);
					startActivity(intent);
					
					Toast.makeText(getApplicationContext(),"festival",Toast.LENGTH_SHORT).show();
					break;
				
				}
			}
        });
        final ImageButton ib2 = (ImageButton)findViewById(R.id.setting2);
        ib2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId())
				{
				case R.id.setting2:
					Intent intent = new Intent(weekend.this,setting.class);
					startActivity(intent);
					
					Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_SHORT).show();
					break;
				
				}
			}
        });
	}

}
