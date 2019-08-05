package com.example.student.mobidine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

   public void logToMyProf(View view){
       Intent intent = new Intent(Login.this, MyProfile.class);
       startActivity(intent);
   }
}
