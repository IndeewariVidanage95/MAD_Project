package com.example.student.mobidine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void goToMyProfile (View view){
        Intent intent = new Intent(SignUp.this, MyProfile.class);
        startActivity(intent);
    }

    public void goToLogin (View view){
        Intent intent = new Intent(SignUp.this, Login.class);
        startActivity(intent);
    }
}
