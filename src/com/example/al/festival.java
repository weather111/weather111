package com.example.al;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class festival extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.festivalmain);
		// TODO Auto-generated method stub
		final ImageButton ib = (ImageButton)findViewById(R.id.main3);
        ib.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			switch(v.getId())
			{
			case R.id.main3:
				Intent intent = new Intent(festival.this,MainActivity.class);
				startActivity(intent);
				
				Toast.makeText(getApplicationContext(),"main",Toast.LENGTH_SHORT).show();
				break;
			
			}
			
				
				
			}
			
        });
 
        final ImageButton ib1 = (ImageButton)findViewById(R.id.weekend3);
        ib1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId())
				{
				case R.id.weekend3:
					Intent intent = new Intent(festival.this,weekend.class);
					startActivity(intent);
					
					Toast.makeText(getApplicationContext(),"weekend",Toast.LENGTH_SHORT).show();
					break;
				
				}
			}
        });
        final ImageButton ib2 = (ImageButton)findViewById(R.id.setting3);
        ib2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId())
				{
				case R.id.setting3:
					Intent intent = new Intent(festival.this,setting.class);
					startActivity(intent);
					
					Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_SHORT).show();
					break;
				
				}
			}
        });
        final Button ib3 = (Button)findViewById(R.id.spring);
        ib3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId())
				{
				case R.id.spring:
					Intent intent = new Intent(festival.this,festival_spring.class);
					startActivity(intent);
					
					Toast.makeText(getApplicationContext(),"spring",Toast.LENGTH_SHORT).show();
					break;
				
				}
			}
        });
	}

}