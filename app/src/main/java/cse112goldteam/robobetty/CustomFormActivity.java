package cse112goldteam.robobetty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class CustomFormActivity extends ActionBarActivity implements View.OnClickListener {

    private EditText editTextAllergies, editTextFavoriteColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_form);
        this.findViewById(android.R.id.content).setBackgroundResource(Business.background);
        findViewById(R.id.buttonNextCustomForm).setOnClickListener(this);
        findViewById(R.id.buttonCancelCustomForm).setOnClickListener(this);
        editTextAllergies = (EditText) findViewById(R.id.editTextAllergies);
        editTextFavoriteColor = (EditText) findViewById(R.id.editTextFavoriteColor);
    }



    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonNextCustomForm){
            String allgergies = editTextAllergies.getText().toString();
            String favoriteColor = editTextFavoriteColor.getText().toString();
            Intent gotoSignatureActivity = new Intent(this, SignatureActivity.class);
            startActivity(gotoSignatureActivity);
            overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
            this.finish();
        }
        else if(v.getId() == R.id.buttonCancelCustomForm) {
            this.onBackPressed();
        }

    }
    public void onBackPressed() {
        this.finish();
        Intent gotoFoundActivity = new Intent(this, FoundActivity.class);
        startActivity(gotoFoundActivity);
        overridePendingTransition  (R.anim.left_slide_in, R.anim.left_slide_out);
    }
}
