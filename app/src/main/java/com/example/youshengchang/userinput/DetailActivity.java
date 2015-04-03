package com.example.youshengchang.userinput;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.youshengchang.userinput.model.Student;


public class DetailActivity extends ActionBarActivity {

    private Student student;

    private final String LOGTAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ActionBar bar = getActionBar();
        Log.i(LOGTAG, "bar = " + bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle extra = getIntent().getExtras();

//        String firstName = extra.getString("firstName");
//        String lastName = extra.getString("lastName");
//        String email = extra.getString("email");
//        Log.i(LOGTAG, "firstName: " + firstName + " lastName: " + lastName + " email: " + email);

        student = extra.getParcelable(".model.Student");
        Log.i(LOGTAG, student.toString());
        String firstName = student.getFirstName();
        String lastName = student.getLastName();
        String email = student.getEmail();

        TextView firstNameText = (TextView) findViewById(R.id.firstName);
        TextView lastNameText = (TextView)findViewById(R.id.lastName);
        TextView emailText = (TextView)findViewById(R.id.email);
        firstNameText.setText(firstName);
        lastNameText.setText(lastName);
        emailText.setText(email);

}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_deatil, menu);
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
        if(id == android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
