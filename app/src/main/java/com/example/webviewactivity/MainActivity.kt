package com.example.webviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    private  val  myWebView:WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Student Portal"
        val myWebView :WebView = findViewById(R.id.webview)
        myWebView.webViewClient = WebViewClient()
        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        //myWebView.addJavascriptInterface(WebAppInterface(this),"Android")
        myWebView.loadUrl("https://myportal.kyu.ac.ug/")
    }

    override fun onBackPressed() {
        if(myWebView!!.canGoBack()){
            myWebView.goBack()
        }else{
            super.onBackPressed()
        }
    }
}