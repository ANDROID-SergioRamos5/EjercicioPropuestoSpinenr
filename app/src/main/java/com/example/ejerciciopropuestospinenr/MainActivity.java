package com.example.ejerciciopropuestospinenr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(MainActivity.this,
                                                                R.array.versiones,
                                                                R.layout.support_simple_spinner_dropdown_item);

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(adapter);


    }
}
