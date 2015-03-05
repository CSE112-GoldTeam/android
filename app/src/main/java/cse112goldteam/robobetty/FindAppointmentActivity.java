package cse112goldteam.robobetty;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FindAppointmentActivity extends ActionBarActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {

    private EditText editTextDOB;
    private Calendar myCalendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_appointment);

        editTextDOB = (EditText) findViewById(R.id.editTextDOB);
        editTextDOB.setOnClickListener(this);
        findViewById(R.id.buttonNext).setOnClickListener(this);
        findViewById(R.id.buttonCancel).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonNext:
                Intent gotoFoundActivity = new Intent(this, FoundActivity.class);
                startActivity(gotoFoundActivity);
                overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
                break;
            case R.id.editTextDOB:
                new DatePickerDialog(this, this, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
                break;
            case R.id.buttonCancel:
                this.onBackPressed();
                break;
        }
    }




    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        myCalendar.set(Calendar.YEAR, year);
        myCalendar.set(Calendar.MONTH, monthOfYear);
        myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        String myFormat = "mm/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        editTextDOB.setText(sdf.format(myCalendar.getTime()));
    }

}
