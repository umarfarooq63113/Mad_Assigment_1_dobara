package com.example.umar.mad_assigment_1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    UserAdapter adapter;
    ArrayList<User> users;
    private static final String UOL = "ABC";
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        users = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            users.add(new User(R.drawable.call_dp, "umar1", "123"));
        }

        layoutManager = new LinearLayoutManager(this);
        adapter = new UserAdapter(users,this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}


