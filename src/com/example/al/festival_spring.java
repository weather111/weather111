package com.example.al;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class festival_spring extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	setContentView(R.layout.festival_spring);
	    // TODO Auto-generated method stub
	
	final Button bt = (Button)findViewById(R.id.festivalback);
    bt.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.festivalback:
			Intent intent = new Intent(festival_spring.this,festival.class);
			startActivity(intent);
			
			Toast.makeText(getApplicationContext(),"뒤로가기",Toast.LENGTH_SHORT).show();
			break;
		
		}
		
			
			
		}
		
    });
}
}