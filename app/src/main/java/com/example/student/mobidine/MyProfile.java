package com.example.student.mobidine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
    }

    public void goToEdit(View view){
        Intent intent = new Intent(MyProfile.this, EditProfile.class);
        startActivity(intent);
    }
}
