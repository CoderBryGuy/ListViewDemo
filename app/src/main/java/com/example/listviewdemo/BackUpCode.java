//package com.example.listviewdemo;
//
//import android.util.Log;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class BackUpCode {
//
//    final List<String> familyMembersList = Arrays.asList(familyMembers);
//
//    ListView myListView = (ListView) findViewById(R.id.myListView);
//
//    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, familyMembersList);
//
//        myListView.setAdapter(arrayAdapter);
//
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//            Log.i("info", " " + familyMembersList.get(i));
//
//        }
//    });
//}
//}
