package com.example.david.schooldatabase;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

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

    public void onClickStudents(View view) {
        startActivity(new Intent(this, StudentsActivity.class));
    }

    public void onClickCourses(View view) {
        startActivity(new Intent(this, CoursesActivity.class));
    }

    public void onClickEnrollment(View view) {
        startActivity(new Intent(this, EnrollmentsActivity.class));
    }

    public void onClickAssessment(View view) {
        startActivity(new Intent(this, AssessmentsActivity.class));
    }

    public void onClickLogout(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
