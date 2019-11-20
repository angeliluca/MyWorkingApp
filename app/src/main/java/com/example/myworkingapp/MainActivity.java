package com.example.myworkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*View è una classe che contiene tutti gli elementi grafici, che va importata.
    * gli intent sono classi utilizzate per far partire diverse activity. Facciamo un esempio di
    * intent esplicito, dove specifichiamo la activity che vogliamo aprire.
     */
    public void openConverter(View view){
        Intent intent = new Intent(this,TempConverter.class);
        startActivity(intent);
    }
    public void openUtils(View view){
        Intent intent = new Intent(this, OfficeUtils.class);
        startActivity(intent);
    }
}

//puzzi molto molto molto