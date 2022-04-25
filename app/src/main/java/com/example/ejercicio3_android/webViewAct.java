package com.example.ejercicio3_android;

import androidx.appcompat.app.AppCompatActivity;

import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.os.Bundle;

public class webViewAct extends AppCompatActivity {
    WebView webView;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getSupportActionBar().hide();
        webView = findViewById(R.id.wv1);
        String url = getIntent().getExtras().getString("url");
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient());
    }
}