package com.example.saxton.secretsanta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_start)
public class StartActivity extends AppCompatActivity {

    @ViewById(R.id.get_started_button)
    Button getStartedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

   @Click(R.id.get_started_button)
    public void getStarted(){

   }
}
