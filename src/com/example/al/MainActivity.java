package com.example.al;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
// 프로젝트명: 축제&날씨
// UI - 메인화면: 타이틀바에 현재날씨 아이콘표시/현재날씨,기온/시간대별날씨,기온/강수확률/습도/현재위치/새로고침버튼/하단메뉴4개(현재예보, 주간예보, 축제, 설정) 


public class MainActivity extends ActionBarActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainview);
        
        final TextView tv = (TextView)findViewById(R.id.textView1);
        final Button bt = (Button)findViewById(R.id.button1);
        
        bt.setOnClickListener(this);
      
        ImageButton ib1 = (ImageButton)findViewById(R.id.weekend);
        ib1.setOnClickListener(this);
        		
        /*
        bt.setOnClickListener(new OnClickListener() {
		int count = 0;
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(count%2==0)
				{
					TextView tv = (TextView)findViewById(R.id.textView1);
					tv.setText("순천시");
					tv.setTextColor(Color.BLUE);
					Toast.makeText(getApplicationContext(),"한번눌렀습니다",Toast.LENGTH_SHORT).show();
				}	
				else if(count%2==1)
				{
					TextView tv = (TextView)findViewById(R.id.textView1);
					tv.setText("서울특별시");
					tv.setTextColor(Color.RED);
					Toast.makeText(getApplicationContext(),"원상복귀",Toast.LENGTH_SHORT).show();
	
				}
				count++;
					//tv.setText("순천시");
					//Toast.makeText(getApplicationContext(),"한번눌렀습니다",Toast.LENGTH_SHORT).show();
				
				
				//tv.setTextColor(Color.RED);
				//Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
			}
		});
        */
        final ImageButton ib = (ImageButton)findViewById(R.id.imageButton1);
        ib.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"업데이트되었습니다.",Toast.LENGTH_SHORT).show();
			}
        });
        	
        
        
       // Toast.makeText(getApplicationContext(),"업데이트되었습니다.",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch ( v.getId()) {
		case R.id.button1:
			Toast.makeText(getApplicationContext(),"한번눌렀습니다",Toast.LENGTH_SHORT).show();
			break;
		case R.id.weekend:
			Intent intent = new Intent(MainActivity.this,weekend.class);
			startActivity(intent);
			
			Toast.makeText(getApplicationContext(),"weekend",Toast.LENGTH_SHORT).show();
			break;
			
		}
		
	}
}

