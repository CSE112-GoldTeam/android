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
                overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
                break;

            case R.id.buttonNoProblem:
                Intent gotoNoCode = new Intent(this, NoCodeActivity.class);
                startActivity(gotoNoCode);
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
