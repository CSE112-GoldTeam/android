package cse112goldteam.robobetty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class EnterCodeActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_code);

        findViewById(R.id.buttonNextEnterCode).setOnClickListener(this);
        findViewById(R.id.buttonNoProblem).setOnClickListener(this);
    }

    /**
     * Call back when user clicks on a button.
     *
     * implements: OnClickListener
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.buttonNextEnterCode:
                Intent gotoFindAppointmentActivity = new Intent(this, FindAppointmentActivity.class);
                startActivity(gotoFindAppointmentActivity);
                break;

            case R.id.buttonNoProblem:
                Intent gotoNoCode = new Intent(this, NoCodeActivity.class);
                startActivity(gotoNoCode);
                break;
        }
    }
}
