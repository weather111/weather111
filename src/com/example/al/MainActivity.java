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
// ������Ʈ��: ����&����
// UI - ����ȭ��: Ÿ��Ʋ�ٿ� ���糯�� ������ǥ��/���糯��,���/�ð��뺰����,���/����Ȯ��/����/������ġ/���ΰ�ħ��ư/�ϴܸ޴�4��(���翹��, �ְ�����, ����, ����) 


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
					tv.setText("��õ��");
					tv.setTextColor(Color.BLUE);
					Toast.makeText(getApplicationContext(),"�ѹ��������ϴ�",Toast.LENGTH_SHORT).show();
				}	
				else if(count%2==1)
				{
					TextView tv = (TextView)findViewById(R.id.textView1);
					tv.setText("����Ư����");
					tv.setTextColor(Color.RED);
					Toast.makeText(getApplicationContext(),"���󺹱�",Toast.LENGTH_SHORT).show();
	
				}
				count++;
					//tv.setText("��õ��");
					//Toast.makeText(getApplicationContext(),"�ѹ��������ϴ�",Toast.LENGTH_SHORT).show();
				
				
				//tv.setTextColor(Color.RED);
				//Toast.makeText(getApplicationContext(), "��ư�� ���Ƚ��ϴ�.", Toast.LENGTH_SHORT).show();
			}
		});
        */
        final ImageButton ib = (ImageButton)findViewById(R.id.imageButton1);
        ib.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"������Ʈ�Ǿ����ϴ�.",Toast.LENGTH_SHORT).show();
			}
        });
        	
        
        
       // Toast.makeText(getApplicationContext(),"������Ʈ�Ǿ����ϴ�.",Toast.LENGTH_SHORT).show();
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
			Toast.makeText(getApplicationContext(),"�ѹ��������ϴ�",Toast.LENGTH_SHORT).show();
			break;
		case R.id.weekend:
			Intent intent = new Intent(MainActivity.this,weekend.class);
			startActivity(intent);
			
			Toast.makeText(getApplicationContext(),"weekend",Toast.LENGTH_SHORT).show();
			break;
			
		}
		
	}
}

