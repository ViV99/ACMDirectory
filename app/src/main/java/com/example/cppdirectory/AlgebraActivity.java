package com.example.cppdirectory;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AlgebraActivity extends ListActivity {
    private String[] arr = {"Элементарные алгоритмы", "Сложные алгоритмы"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra);
        ListView algList = (ListView) findViewById(R.id.algebra);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        algList.setAdapter(adapter);
    }
}
