package com.ggave.contactlist.activities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ggave.contactlist.R;
import com.ggave.contactlist.adapters.ContactsAdapter;
import com.ggave.contactlist.repositories.ContactsRepositories;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FloatingActionButton addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.contacts_list);
        addButton = findViewById(R.id.button_user);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ContactsAdapter adapter = new ContactsAdapter();

        adapter.setContacts(ContactsRepositories.getContacts());

        recyclerView.setAdapter(adapter);



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callRegister();
            }
        });

    }

    private static final int REGISTER_REQUEST_CODE = 100;

    private void callRegister(){

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivityForResult(intent, REGISTER_REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REGISTER_REQUEST_CODE){
            if(requestCode == RESULT_OK){
                //Refrescar el recyclerview...
            }

        }
    }









}
