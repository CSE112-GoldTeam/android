package cse112goldteam.robobetty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class WelcomeActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Set listeners for the buttons.
        findViewById(R.id.buttonCheckIn).setOnClickListener(this);
        findViewById(R.id.buttonNoAppointment).setOnClickListener(this);
    }


    /**
     * Call back when user clicks on a button.
     *
     * implements: OnClickListener
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.buttonCheckIn:
//                Intent gotoEnterCodeActivity = new Intent(this, EnterCodeActivity.class);
//                startActivity(gotoEnterCodeActivity);
                break;

            case R.id.buttonNoAppointment:
                Intent gotoDoneActivity = new Intent(this, NoAppointment.class);
                startActivity(gotoDoneActivity);
                break;
        }
    }
}
