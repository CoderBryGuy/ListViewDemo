package com.example.listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] familyMembers = new String[]{
            "Osher", "Adir", "Shoshi", "Jason", "Lori", "Mike", "Randi", "Karsyn"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> myArrayList = Arrays.asList(familyMembers);

        final ListView myListView = (ListView)findViewById(R.id.myListView);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArrayList);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                
                Toast.makeText(MainActivity.this, myArrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });


    }
}