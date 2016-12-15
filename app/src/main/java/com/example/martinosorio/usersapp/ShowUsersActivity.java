package com.example.martinosorio.usersapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowUsersActivity extends AppCompatActivity {

    private static final String TAG = "myTag";
    private TextView UsersTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_users);

        Intent i = getIntent();
        ArrayList<User> users = i.getParcelableArrayListExtra("users");

        UsersTextView = (TextView) findViewById(R.id.UsersTextView);
        UsersTextView.setText("USERS:\n\n");

        for(User u : users){
            UsersTextView.append(u.toString() + "\n");
            Log.d(TAG, "onCreate: " + u.toString());
        }
    }
}
