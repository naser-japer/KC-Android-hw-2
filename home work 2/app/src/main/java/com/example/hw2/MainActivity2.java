package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView n = findViewById(R.id.textView2);
        TextView a = findViewById(R.id.textView3);
        TextView j = findViewById(R.id.textView4);
        TextView p = findViewById(R.id.textView5);
        TextView e = findViewById(R.id.textView6);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("back");
        n.setText(name);

    int age = bundle.getInt("back2");
a.setText(String.valueOf(age));

String jop = bundle.getString("back3");
j.setText(jop);

int phone = bundle.getInt("back4");
p.setText(String.valueOf(phone));

String email = bundle.getString("back5");
e.setText(email);

    }
}