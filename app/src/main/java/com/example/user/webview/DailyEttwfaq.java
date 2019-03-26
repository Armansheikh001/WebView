package com.example.user.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DailyEttwfaq extends AppCompatActivity {


    WebView myWebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_ettwfaq);

        getSupportActionBar().setTitle("Daily Ittefaq");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myWebview = findViewById(R.id.webViewId3);
        WebSettings webSettings=myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebview.setWebViewClient(new WebViewClient());

        myWebview.loadUrl("https://www.ittefaq.com.bd");
    }
}
