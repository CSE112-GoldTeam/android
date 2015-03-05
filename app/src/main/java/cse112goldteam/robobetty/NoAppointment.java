package cse112goldteam.robobetty;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class NoAppointment extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_appointment);
        this.findViewById(android.R.id.content).setBackgroundResource(Business.background);
    }
}
