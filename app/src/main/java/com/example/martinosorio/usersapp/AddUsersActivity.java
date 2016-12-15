package com.example.martinosorio.usersapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AddUsersActivity extends AppCompatActivity {
    ArrayList<User> users;
    EditText FirstNameEditText;
    EditText LastNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_users);

        users = new ArrayList<User>();
        FirstNameEditText = (EditText) findViewById(R.id.FirstNameEditText);
        LastNameEditText = (EditText) findViewById(R.id.LastNameEditText);
    }

    public void onAddUserClick(View view) {
        User user = new User(FirstNameEditText.getText().toString(), LastNameEditText.getText().toString());
        users.add(user);
        FirstNameEditText.setText("");
        LastNameEditText.setText("");
        Toast.makeText(this, "Added " + user.toString() + " to the database.", Toast.LENGTH_SHORT).show();
    }

    public void onShowUsersClick(View view) {
        Intent i = new Intent(this, ShowUsersActivity.class);
        i.putExtra("users", users);
        startActivity(i);
    }
}
