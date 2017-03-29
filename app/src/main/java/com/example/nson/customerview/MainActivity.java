package com.example.nson.customerview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.nson.customerview.Model.Contact;
import com.example.nson.customerview.adapter.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact= (ListView) findViewById(R.id.lvContact);

        ArrayList<Contact> arrContact =new ArrayList<Contact>();
        Contact contact1= new Contact("nguyen ngọc son", "0987567623232", Color.BLUE);
        Contact contact2= new Contact("nguyen ngọc khanh", "09875767676", Color.DKGRAY);
        arrContact.add(contact1);
        arrContact.add(contact2);

        CustomAdapter customAdapter= new CustomAdapter(this,R.layout.row_item_contact, arrContact);

        lvContact.setAdapter(customAdapter);
    }
}
