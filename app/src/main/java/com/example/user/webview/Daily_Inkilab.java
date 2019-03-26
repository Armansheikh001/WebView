package com.example.user.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Daily_Inkilab extends AppCompatActivity {

    WebView myWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily__inkilab);

        getSupportActionBar().setTitle("Daily Inqilab");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myWebview = findViewById(R.id.webViewId6);
        WebSettings webSettings=myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebview.setWebViewClient(new WebViewClient());

        myWebview.loadUrl("https://www.dailyinqilab.com");
    }
}
