package cse112goldteam.robobetty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class FoundActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_activity);
        this.findViewById(android.R.id.content).setBackgroundResource(Business.background);
        findViewById(R.id.buttonNext).setOnClickListener(this);
        findViewById(R.id.buttonNotYou).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonNext:
                Intent gotoCustomFormActivity = new Intent(this, CustomFormActivity.class);
                startActivity(gotoCustomFormActivity);
                overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
                break;

            case R.id.buttonNotYou:
                this.onBackPressed();
                break;

        }
    }

    public void onBackPressed() {
        this.finish();
        Intent gotoFindAppointmentActivity = new Intent(this, FindAppointmentActivity.class);
        startActivity(gotoFindAppointmentActivity);
        overridePendingTransition(R.anim.left_slide_in, R.anim.left_slide_out);
    }

}
