package com.mordekyle.missouriselfdefenselaws;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
    
	Button video = (Button) findViewById(R.id.video);
	       video.setOnClickListener(new View.OnClickListener() {
	    	   
	    	   public void onClick(View argo0) {
	    		   Intent vid = new Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
	    		   startActivity(vid);
	    	   
	    	   }
	    	   });
	
	       Button ccw = (Button) findViewById(R.id.btnCCW);
	   	ccw.setOnClickListener(new View.OnClickListener() {
	   		
	   		public void onClick(View argo0) {
	   			
	   		Intent ccw = new Intent(MainActivity.this, CCWActivity.class);
	   		startActivity(ccw);
	   		
	   		}
	   		});
	
	Button rec = (Button) findViewById(R.id.btnRec);
	rec.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View argo0) {
			
		Intent rec = new Intent(MainActivity.this, ReciprocityActivity.class);
		startActivity(rec);
		
		}
		});
	
	/*Button castle = (Button) findViewById(R.id.cstlButton);
	castle.setOnClickListener(new View.OnClickListener()
	{
		public void onClick(View arg0)
		{
			Intent cstl = new Intent(MainActivity.this, CastleActivity.class);
			startActivity(cstl);
		}
	});*/
	
	Button knife = (Button) findViewById(R.id.btnknife);
	knife.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View argo0) {
			
		Intent knife = new Intent(MainActivity.this, KnifeActivity.class);
		startActivity(knife);
		
		}
		});
	
	;}
	
		
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
		case R.id.menu_settings:
			Intent info = new Intent(MainActivity.this, InfoActivity.class);
			startActivity(info);
		}
		return true;
	}}
	


