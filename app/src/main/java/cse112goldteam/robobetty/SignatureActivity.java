package cse112goldteam.robobetty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class SignatureActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signature);

        findViewById(R.id.buttonDoneSignActivity).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonDoneSignActivity:
                Intent gotoDoneActivity = new Intent(this, DoneActivity.class);
                startActivity(gotoDoneActivity);
                overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
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
