package com.example.youshengchang.userinput;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.youshengchang.userinput.model.Person;
import com.example.youshengchang.userinput.model.Student;


public class MainActivity extends ActionBarActivity {

    private final String LOGTAG = "MainActivity";
    private Person person;
    private Student student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void submitInfo(View v){
        Log.i(LOGTAG,"Submit clicked.");
        EditText firstNameEdit = (EditText) findViewById(R.id.firstName);
        EditText lastNameEdit = (EditText) findViewById(R.id.lastName);
        EditText emailEdit = (EditText) findViewById(R.id.email);
        String firstName = firstNameEdit.getText().toString();
        String lastName = lastNameEdit.getText().toString();
        String email = emailEdit.getText().toString();

//        person = new Person(firstName, lastName, email);
//
//        Log.i(LOGTAG, "person: " + person);
//
//        Intent intent = new Intent(this, DetailActivity.class);
//        intent.putExtra("firstName", firstName);
//        intent.putExtra("lastName", lastName);
//        intent.putExtra("email", email);

        student = new Student(firstName, lastName, email);

        Log.i(LOGTAG, "student: " + student);
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(".model.Student", student);
        this.startActivity(intent);

    }
}
