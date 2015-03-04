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
        findViewById(R.id.buttonNextFindAppointment).setOnClickListener(this);
        findViewById(R.id.buttonNotYou).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonNextFindAppointment:
                Intent gotoCustomFormActivity = new Intent(this, CustomFormActivity.class);
                startActivity(gotoCustomFormActivity);
                break;

            case R.id.buttonNotYou:
                Intent gotoWelcomeActivity = new Intent(this, WelcomeActivity.class);
                startActivity(gotoWelcomeActivity);
                break;

        }
    }
}
