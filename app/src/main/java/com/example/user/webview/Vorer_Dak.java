package com.example.user.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Vorer_Dak extends AppCompatActivity {

    WebView myWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vorer__dak);

        getSupportActionBar().setTitle("Bhorer-Dak");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myWebview = findViewById(R.id.webViewId8);
        WebSettings webSettings=myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebview.setWebViewClient(new WebViewClient());

        myWebview.loadUrl("https://www.bhorer-dak.com");
    }
}
