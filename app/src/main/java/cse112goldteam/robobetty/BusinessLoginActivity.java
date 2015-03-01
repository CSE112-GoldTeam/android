package cse112goldteam.robobetty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class BusinessLoginActivity extends ActionBarActivity implements View.OnClickListener {

    private EditText editTextEmail, editTextPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_login);

        //TODO: add a check here to check if we already logged in. If so, then go to WelcomeActivity

        findViewById(R.id.buttonLogin).setOnClickListener(this);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonLogin){
            String email = editTextEmail.getText().toString();
            String password = editTextPassword.getText().toString();
            Intent gotoFromActivity = new Intent(this, FindAppointmentActivity.class);
            startActivity(gotoFromActivity);
            overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
        }
    }
}
