package br.com.soluevo.nikemodule

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_nike.*

class NikeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nike)
        setUpToolbar()
        setUpWebView()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setUpWebView() {
        val myWebView = webview
        myWebView.loadUrl("https://www.nike.com.br/")

        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
    }


    private fun setUpToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            title = "Nike"
        }

        toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}
