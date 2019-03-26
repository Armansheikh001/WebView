package com.example.user.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    WebView myWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("Prothom Alo");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        myWebview = findViewById(R.id.webViewId2);
        WebSettings webSettings=myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);



        myWebview.setWebViewClient(new WebViewClient());

        myWebview.loadUrl("https://www.prothomalo.com");

    }
}
