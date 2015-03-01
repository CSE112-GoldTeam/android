package cse112goldteam.robobetty;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class FoundActivty extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_activty);
        findViewById(R.id.buttonNextFindAppointment).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonNextFindAppointment:
//                Intent gotoFromActivity = new Intent(this, FormActivity.class);
//                startActivity(gotoFromActivity);
                break;

            case R.id.buttonNotYou:
                break;

        }
    }
}
