package edu.ucsb.cs.cs185.seanshelton.seansheltonscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //teams = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);

        AutoCompleteTextView teamName1;
        AutoCompleteTextView teamName2;

        teamName1 = (AutoCompleteTextView) findViewById(R.id.team1Name);
        teamName2 = (AutoCompleteTextView) findViewById(R.id.team2Name);


        //String[] teams = getResources().getStringArray(R.array.teams);


        //ArrayAdapter<String> adapter = new ArrayAdapter<String>
                //(this, android.R.layout.simple_dropdown_item_1line,teams);

        //ArrayAdapter<String> adapter2 = new ArrayAdapter<String>
                //(this, android.R.layout.simple_dropdown_item_1line,teams);

        //teamName1.setAdapter(teams);
        //teamName2.setAdapter(adapter2);

        setContentView(R.layout.activity_main);
    }
}
