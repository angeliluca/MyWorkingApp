package com.example.myworkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import static android.content.Intent.ACTION_VIEW;

public class OfficeUtils extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_utils);
    }

    public void browse(View v){
        Intent intent=new Intent(ACTION_VIEW, Uri.parse("http://www.unibo.it"));
        startActivity(intent);
    }
    public void call(View v){
        Intent intent=new Intent(ACTION_VIEW, Uri.parse("tel:3393452980"));
        startActivity(intent);
    }
    public void email(View v){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"daniele.tarchi@unibo.it"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Ricevimento");
        intent.putExtra(Intent.EXTRA_TEXT, "Quando posso trovarla in ufficio?");
        startActivity(intent);
    }
    public void openList(View v){
        Intent intent = new Intent(this,SimpleContactListActivity.class);
        startActivity(intent);
    }


}
