package com.mordekyle.missouriselfdefenselaws;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CastleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_castle);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_ccw, menu);
		return false;
	}

}