package cse112goldteam.robobetty;

import android.os.Bundle;

import cse112goldteam.robobetty.Formlib.FormActivity;


public class DynamicForm extends FormActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamicform);
        generateForm("{\n" +
                "    \"Name\": {\n" +
                "        \"type\": \"textfield\",\n" +
                "        \"priority\": \"0\"\n" +
                "    },\n" +
                "    \"Email\": {\n" +
                "        \"type\": \"textfield\",\n" +
                "        \"priority\": \"1\",\n" +
                "\t\"hint\":\"YourEmail@xxx.com\"\n" +
                "    },\n" +
                "    \"Gender\": {\n" +
                "        \"type\": \"dropdown\",\n" +
                "        \"priority\": \"2\",\n" +
                "        \"options\": [\"Male\",\"Female\"] \n" +
                "    },\n" +
                "    \"Favorite Color\": {\n" +
                "        \"type\": \"dropdown\",\n" +
                "        \"priority\": \"3\",\n" +
                "        \"options\": [\"Blue\", \"Yellow\", \"Green\", \"Pink\"]\n" +
                "    }\n" +
                "}\n" +
                "\n");
        save();
    }
}
