package com.example.myworkingapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TempConverter extends AppCompatActivity {

    private EditText textCelsius;
    private EditText textFahrenheit;

    //definire EXTRA_MESSAGE con nome che inizia con il nome del package, è la chiave per passare dati mediante extra.
    public final static String EXTRA_MESSAGE = "com.example.MylabSwTlcApp.message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);

        //trova la view che ha l'Id edit_celsius e ne inserisce il testo in textCelsius.
        textCelsius = (EditText)findViewById(R.id.edit_celsius);
        textFahrenheit = (EditText)findViewById(R.id.edit_fahrenheit);
    }


    //Metodo che si occupa della conversione da celsius a fahrenheit
    private float celsiusToFar(float celsius){
        return (celsius * 9.0f / 5.0f) + 32.0f;
    }
    private float fahrToCelsius(float fhar){
        return (fhar -32)*(5.0f/9.0f);
    }
    public void convertToF(View view){
        //conversione della stringa dell'Edit Text in float.
        float valueCelsius = Float.parseFloat(textCelsius.getText().toString());
        float newFahr = celsiusToFar(valueCelsius);

        //voglio lanciare una terza activity che mostra il risultato, però questa volta è necessario passare il risultato mediante EXTRA.
        Intent intent = new Intent(this, DisplayTemperatureActivity.class);

        //conversione float -> string.
        //textFar.setText(String.valueOf(newFar));
        //EXTRA_MESSAGE da definire
        String result = newFahr + " Gradi Fahrenheit.";
        intent.putExtra(EXTRA_MESSAGE, result);
        startActivity(intent);
    }
    public void convertToC(View view){
        float valueFahrenheit = Float.parseFloat(textFahrenheit.getText().toString());
        float newCelsius = fahrToCelsius(valueFahrenheit);
        Intent intent = new Intent(this,DisplayTemperatureActivity.class);
        String result = newCelsius + " Gradi Centigradi";
        intent.putExtra(EXTRA_MESSAGE, result);
        startActivity(intent);
    }

}
