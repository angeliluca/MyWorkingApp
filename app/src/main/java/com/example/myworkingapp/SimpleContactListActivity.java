package com.example.myworkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleContactListActivity extends AppCompatActivity
{
    EditText ed1,ed2,ed3;
    Button b1;
    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Name = "nameKey";
    public static final String Phone = "phoneKey";
    public static final String Email = "emailKey";
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.cl_name_editText);
        ed2=(EditText)findViewById(R.id.cl_phone_editText);
        ed3=(EditText)findViewById(R.id.cl_email_editText);
        b1=(Button)findViewById(R.id.cl_button);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String n = sharedpreferences.getString(Name,"Name");
        String ph = sharedpreferences.getString(Phone,"Phone");
        String e = sharedpreferences.getString(Email,"Email");
        ed1.setText(n);
        ed2.setText(ph);
        ed3.setText(e);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = ed1.getText().toString();
                String ph = ed2.getText().toString();
                String e = ed3.getText().toString();
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(Name, n);
                editor.putString(Phone, ph);
                editor.putString(Email, e);
                editor.commit();
                Toast.makeText(SimpleContactListActivity.this,"Thanks",Toast.LENGTH_LONG).show();
            }
        });
    }
}
