package br.com.soluevo.sansungmodule

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sansung.*

class SansungActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sansung)

        setUpToolbar()

        val myWebView = webview
        myWebView.loadUrl("https://www.samsung.com/br/")

        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
    }


    private fun setUpToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            title = "Samsung"
        }

        toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}
