package com.example.synappz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button TimeLine;
	
	Button HowFeel;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HowFeel = (Button) findViewById(R.id.btnFeel);
		HowFeel.setOnClickListener(this);
		TimeLine = (Button) findViewById(R.id.btnTimeLine);
		TimeLine.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int getId = v.getId();
		if (getId == R.id.btnFeel) {
			Intent i = new Intent(getApplicationContext(), FeelActivity.class);
			startActivity(i);
		}
		if (getId == R.id.btnTimeLine) {
			Intent i = new Intent(getApplicationContext(),
					HorzScrollWithListMenu.class);
			startActivity(i);
		}

	}

}
