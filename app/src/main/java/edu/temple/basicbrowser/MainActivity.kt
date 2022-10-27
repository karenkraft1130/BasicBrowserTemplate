package edu.temple.basicbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    lateinit var urlEditText: EditText
    lateinit var goButton: ImageButton
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        urlEditText = findViewById(R.id.urlEditText)
        goButton = findViewById(R.id.goButton)
        webView = findViewById(R.id.webView)

        // Allow your browser to intercept hyperlink clicks
        webView.webViewClient = object : WebViewClient()

        //Enable JavaScript
        webView.settings.javaScriptEnabled = true

        //Allow a website to be loaded in the WebView when a
         //user types a URL into the address bar and clicks the Go button
      // val url = webView.loadUrl(urlEditText.toString())

        //If a user types an incomplete URL (eg: temple.edu),
         //complete the URL (https://temple.edu) before loading it
        if (urlEditText.text.contains("https://")){

            }else{
               val newString = "https://$urlEditText.com"
                 webView.loadUrl(newString)
        }

        //When a page has loaded, update the Activity's title to show the web page's title



    }
}