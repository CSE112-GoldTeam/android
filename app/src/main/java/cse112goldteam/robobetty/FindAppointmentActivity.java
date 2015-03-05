package cse112goldteam.robobetty;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FindAppointmentActivity extends ActionBarActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {

    private ImageView view;
    private AnimationDrawable frameAnimation;
    private EditText editTextDOB;
    private Calendar myCalendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_appointment);
        this.findViewById(android.R.id.content).setBackgroundResource(Business.background);

        editTextDOB = (EditText) findViewById(R.id.editTextDOB);
        editTextDOB.setOnClickListener(this);
        findViewById(R.id.buttonNext).setOnClickListener(this);
        findViewById(R.id.buttonCancel).setOnClickListener(this);

        // Initialize ImageView and set animation on background
        view = (ImageView) findViewById(R.id.imageAnimation);
        view.setBackgroundResource(R.drawable.animation_list);

        // Typecasting the Animation Drawable
        frameAnimation = (AnimationDrawable) view.getBackground();
    }

    // Called when Activity becomes visible or invisible to the user
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            // Starting the animation when in Focus
            frameAnimation.start();
        } else {
            // Stoping the animation when not in Focus
            frameAnimation.stop();
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonNext:
                Intent gotoFoundActivity = new Intent(this, FoundActivity.class);
                startActivity(gotoFoundActivity);
                overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
                this.finish();
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
    public void onBackPressed() {
        this.finish();
        overridePendingTransition(R.anim.left_slide_in, R.anim.left_slide_out);
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
