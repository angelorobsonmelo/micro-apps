package br.com.soluevo.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.soluevo.hpmodule.HpActivity
import br.com.soluevo.nikemodule.NikeActivity
import br.com.soluevo.sansungmodule.SansungActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToSamsungWebView()
    }

    private fun goToSamsungWebView() {
        startActivity(Intent(this, SansungActivity::class.java))
    }
}
