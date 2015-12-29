package com.example.application;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private Button switchToGreen;
	private Button switchToRed;
	private Button switchToBlue;
	private Button switchToWallpaper;
	private LinearLayout screenLayout;
	private Toast informationToast;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// init buttons
		switchToBlue = (Button) findViewById(R.id.switchBlue);
		switchToGreen = (Button) findViewById(R.id.switchGreen);
		switchToRed = (Button) findViewById(R.id.switchRed);
		switchToWallpaper = (Button) findViewById(R.id.switchWallpaper);
		screenLayout = (LinearLayout) findViewById(R.id.screenLayout);

		// setup listeners
		switchToBlue.setOnClickListener(this);
		switchToRed.setOnClickListener(this);
		switchToGreen.setOnClickListener(this);
		switchToWallpaper.setOnClickListener(this);
		informationToast = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT);

	}

	public void onClick(View view) {
		if (switchToBlue.equals(view)) {
			screenLayout.setBackgroundColor(Color.BLUE);
			showToast("Hello blue");
		} else if (switchToRed.equals(view)) {
			screenLayout.setBackgroundColor(Color.RED);
			showToast("Hello red");
		} else if (switchToGreen.equals(view)) {
			screenLayout.setBackgroundColor(Color.GREEN);
			showToast("Hello green");
		} else if (switchToWallpaper.equals(view)) {
			screenLayout.setBackgroundResource(R.drawable.potato);
			showToast("Hello Potato");
		}

	}

	private void showToast(String text) {
		informationToast.cancel();
		informationToast.setText(text);
		informationToast.show();
	}
}