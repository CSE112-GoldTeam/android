package cse112goldteam.robobetty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class NoCodeActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_code);

        findViewById(R.id.buttonNextNoCodeActivity).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonNextNoCodeActivity:
                Intent gotoFindAppointment = new Intent(this, FindAppointmentActivity.class);
                startActivity(gotoFindAppointment);
                break;
        }
    }
}