package cse112goldteam.robobetty;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Pair;
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
}
