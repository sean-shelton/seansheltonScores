package edu.ucsb.cs.cs185.seanshelton.seansheltonscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
    private DatePicker gamesCalendar;
    AutoCompleteTextView teamName1;
    AutoCompleteTextView teamName2;
    EditText team1Score;
    EditText team2Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calendar startTime = new GregorianCalendar(2014, Calendar.AUGUST, 16);

        gamesCalendar = (DatePicker) findViewById(R.id.datePicker);

        gamesCalendar.updateDate(2014, Calendar.AUGUST, 16);

        //teams = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);

        teamName1 = (AutoCompleteTextView) findViewById(R.id.team1Name);
        teamName2 = (AutoCompleteTextView) findViewById(R.id.team2Name);
        team1Score = (EditText) findViewById(R.id.team1Score);
        team2Score = (EditText) findViewById(R.id.team2Score);


        String[] teams = getResources().getStringArray(R.array.teams);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,teams);

        //ArrayAdapter<String> adapter2 = new ArrayAdapter<String>
                //(this, android.R.layout.simple_dropdown_item_1line,teams);

        teamName1.setAdapter(adapter);
        teamName2.setAdapter(adapter);
    }

    public void onNextGameClick (View view) {

        gamesCalendar.updateDate(2014, Calendar.AUGUST, 16);
        teamName1.setText("");
        teamName2.setText("");
        team1Score.setText(R.string.defaultScoreValue);
        team2Score.setText(R.string.defaultScoreValue);


    }
}
