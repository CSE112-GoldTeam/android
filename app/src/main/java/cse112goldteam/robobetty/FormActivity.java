package cse112goldteam.robobetty;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FormActivity extends ActionBarActivity {

    private List<Pair<String, Boolean>> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        dummyData();

        FormAdapter adapter = new FormAdapter(this, data);
        ListView list = (ListView) findViewById(R.id.listViewFormActivity);
        list.setAdapter(adapter);
    }

    public void dummyData(){
        data = new ArrayList<Pair<String, Boolean>>();
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            Pair<String, Boolean> temp = Pair.create("Form " + i, rand.nextBoolean());
            data.add(temp);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
