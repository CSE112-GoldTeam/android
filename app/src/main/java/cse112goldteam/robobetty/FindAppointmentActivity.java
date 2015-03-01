package cse112goldteam.robobetty;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class FindAppointmentActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_appointment);

        findViewById(R.id.buttonNextFindAppointment).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonNextFindAppointment:
                Intent gotoFromActivity = new Intent(this, FormActivity.class);
                startActivity(gotoFromActivity);
                break;

            case R.id.buttonNotYou:
                break;

        }
    }

    @Override
    public void onBackPressed()
    {
        this.finish();
        overridePendingTransition  (R.anim.left_slide_in, R.anim.left_slide_out);
    }
}
