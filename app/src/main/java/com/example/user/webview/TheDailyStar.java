package com.example.user.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TheDailyStar extends AppCompatActivity {
    WebView myWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_daily_star);

        getSupportActionBar().setTitle("The Daily Star");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myWebview = findViewById(R.id.webViewId2);
        WebSettings webSettings=myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebview.setWebViewClient(new WebViewClient());

        myWebview.loadUrl("https://www.thedailystar.net");
    }
}
