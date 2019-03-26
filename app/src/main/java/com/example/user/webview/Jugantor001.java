package com.example.user.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Jugantor001 extends AppCompatActivity {
    WebView myWebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugantor001);

        getSupportActionBar().setTitle("Jugantor");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myWebview = findViewById(R.id.webViewId4);
        WebSettings webSettings=myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebview.setWebViewClient(new WebViewClient());

        myWebview.loadUrl("https://www.jugantor.com");
    }
}
