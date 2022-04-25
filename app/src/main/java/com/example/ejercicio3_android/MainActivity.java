package com.example.ejercicio3_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPage(View view) {
        Intent webView = new Intent(this, webViewAct.class);
        EditText txtUrl = findViewById(R.id.txtUrl);
        webView.putExtra("url", txtUrl.getText().toString());
        startActivity(webView);
    }
}