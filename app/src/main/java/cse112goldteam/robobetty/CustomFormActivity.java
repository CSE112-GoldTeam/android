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
        findViewById(R.id.buttonNextCustomForm).setOnClickListener(this);
        findViewById(R.id.buttonCancelCustomForm).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonNextCustomForm){
            String allgergies = editTextAllergies.getText().toString();
            String favoriteColor = editTextFavoriteColor.getText().toString();
            Intent gotoSignatureActivity = new Intent(this, SignatureActivity.class);
            startActivity(gotoSignatureActivity);
            overridePendingTransition  (R.anim.right_slide_in, R.anim.right_slide_out);
        }
        else if(v.getId() == R.id.buttonCancelCustomForm) {
            Intent gotoFoundActivity = new Intent(this, FoundActivity.class);
            startActivity(gotoFoundActivity);
            overridePendingTransition  (R.anim.left_slide_in, R.anim.left_slide_out);
        }

    }

}
