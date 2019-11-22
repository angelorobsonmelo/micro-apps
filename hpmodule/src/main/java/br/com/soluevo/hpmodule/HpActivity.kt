package br.com.soluevo.hpmodule

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hp.*

class HpActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hp)
        setUpToolbar()
        setUpWebView()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setUpWebView() {
        val myWebView = webview
        myWebView.loadUrl("https://www.lojahpbrasil.com.br/")

        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
    }


    private fun setUpToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            title = "HP"
        }

        toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}
