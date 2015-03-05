package cse112goldteam.robobetty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class DoneActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        this.findViewById(android.R.id.content).setBackgroundResource(Business.background);
        findViewById(R.id.buttonDone).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonDone) {
            Intent gotoWelcomeActivity = new Intent(this, WelcomeActivity.class);
            startActivity(gotoWelcomeActivity);
            this.finish();
        }

    }
    @Override
    public void onBackPressed()
    {
        this.finish();
        overridePendingTransition  (R.anim.left_slide_in, R.anim.left_slide_out);
    }

}
