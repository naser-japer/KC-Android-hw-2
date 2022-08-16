package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText myname;
private EditText myage;
private EditText myjop;
private EditText myphonenumber;
private EditText myemail;
private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         myname = findViewById(R.id.editText1);
         myage = findViewById(R.id.editText2);
         myjop = findViewById(R.id.editText3);
         myphonenumber = findViewById(R.id.editText4);
         myemail = findViewById(R.id.editText5);
         next = findViewById(R.id.button);

        myname.addTextChangedListener(LOGINtextwatcher);
        myjop.addTextChangedListener(LOGINtextwatcher);
        myemail.addTextChangedListener(LOGINtextwatcher);
        myage.addTextChangedListener(LOGINtextwatcher);
        myphonenumber.addTextChangedListener(LOGINtextwatcher);

         next.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 String name = myname.getText().toString();
                 int age = Integer.parseInt(myage.getText().toString());
                 String jop = myjop.getText().toString();
                 int phone = Integer.parseInt(myphonenumber.getText().toString());
                 String email = myemail.getText().toString();
                 Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                  intent.putExtra("back",name);
                  intent.putExtra("back2",age);
                  intent.putExtra("back3",jop);
                  intent.putExtra("back4",phone);
                  intent.putExtra("back5",email);


                 startActivity(intent);
             }
         });


    }
    private TextWatcher LOGINtextwatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        String name = myname.getText().toString().trim();
        String age = myage.getText().toString().trim();
        String jop = myjop.getText().toString().trim();
        String phone = myphonenumber.getText().toString().trim();
        String email = myemail.getText().toString().trim();

        next.setEnabled(!name.isEmpty() && !age.isEmpty() && !jop.isEmpty() && !phone.isEmpty() && !email.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
