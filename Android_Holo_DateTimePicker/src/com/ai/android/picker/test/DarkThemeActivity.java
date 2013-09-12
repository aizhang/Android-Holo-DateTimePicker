package com.ai.android.picker.test;


import java.util.Calendar;

import com.ai.android.picker.DatePicker;
import com.ai.android.picker.R;
import com.ai.android.picker.TimePicker;
import com.ai.android.picker.R.id;
import com.ai.android.picker.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class DarkThemeActivity extends Activity {

	DatePicker datePicker;
	TimePicker timePicker;
	TextView timeView;
	Button submitView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_dark);

		datePicker = (DatePicker) findViewById(R.id.datePicker);
		timePicker = (TimePicker) findViewById(R.id.timePicker);
		timeView = (TextView) findViewById(R.id.time_view);
		submitView = (Button) findViewById(R.id.get_time_btn);

		submitView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Calendar c = Calendar.getInstance();
				c.set(Calendar.YEAR, datePicker.getYear());
				c.set(Calendar.MONTH, datePicker.getMonth());
				c.set(Calendar.DAY_OF_MONTH, datePicker.getDay());
				c.set(Calendar.HOUR_OF_DAY, timePicker.getHourOfDay());
				c.set(Calendar.MINUTE, timePicker.getMinute());
				timeView.setText(c.getTime().toLocaleString());
			}
		});
	}
}
