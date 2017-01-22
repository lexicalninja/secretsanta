package com.example.saxton.secretsanta;

import android.widget.Button;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Saxton on 1/22/17.
 */

@EActivity(R.layout.activity_add_santas)
public class AddSantasActivity {
    @ViewById(R.id.get_contact_button)
    Button getContactButton;
    @ViewById(R.id.cancel_get_santa_button)
    Button cancelGetSantaButton;


}
