package com.mordekyle.missouriselfdefenselaws;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class InfoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		
		ImageView img = (ImageView)findViewById(R.id.donateButton);
		img.setOnClickListener(new View.OnClickListener(){
		    public void onClick(View v){
		        Intent intent = new Intent();
		        intent.setAction(Intent.ACTION_VIEW);
		        intent.addCategory(Intent.CATEGORY_BROWSABLE);
		        intent.setData(Uri.parse("https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=YZVZSEDGK982N&lc=US&currency_code=USD&bn=PP%2dDonationsBF%3abtn_donate_LG%2egif%3aNonHosted"));
		        startActivity(intent);
		    }
		});
	
	
		
			
			}
			;

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_info, menu);
		return false;
	}

}
