package com.example.codeos2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MyProfileActivity extends AppCompatActivity {

    TextView tv_profile_user_name,tv_profile_email;
    FirebaseAuth auth = FirebaseAuth.getInstance();
    FirebaseUser user = auth.getCurrentUser();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        tv_profile_user_name = findViewById(R.id.tv_profile_user_name);
        tv_profile_email = findViewById(R.id.tv_profile_email);
        tv_profile_user_name.setText(user.getDisplayName());
        tv_profile_email.setText(user.getEmail());

    }
}