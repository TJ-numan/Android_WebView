package com.tjnuman.androidwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        //webView.loadUrl("https://www.jlicl.com:8089/User/AgentRegistration");
        webView.loadUrl("https://www.google.com/");


        //    https://www.jlicl.com:8089/User/AgentRegistration
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }


    }
}