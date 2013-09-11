package com.ai.android.picker.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ai.android.picker.DatePicker;
import com.ai.android.picker.NumberPicker;
import com.ai.android.picker.R;
import com.ai.android.picker.TimePicker;

public class MyActivity extends Activity {

    ViewHolder viewHolder;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        viewHolder = new ViewHolder();
        viewHolder.result = (TextView) findViewById(R.id.result);
        viewHolder.timePicker = (TimePicker) findViewById(R.id.test_time_picker);
        viewHolder.datePicker = (DatePicker) findViewById(R.id.test_date_picker);
        viewHolder.numberPicker = (NumberPicker) findViewById(R.id.test_number_picker);
        viewHolder.getResultBtn = (Button) findViewById(R.id.get_result);
        viewHolder.getResultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = viewHolder.timePicker.getTime() + ", " + viewHolder.datePicker.getDate();
                viewHolder.result.setText(result);
            }
        });

    }

    static class ViewHolder {
        TextView result;
        Button getResultBtn;
        TimePicker timePicker;
        DatePicker datePicker;
        NumberPicker numberPicker;
    }
}
