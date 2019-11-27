package br.com.soluevo.hpmodule

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.soluevo.hpmodule.model.Product
import kotlinx.android.synthetic.main.activity_hp.*

class HpActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hp)
        setUpToolbar()
        recyclerView()
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

    private fun recyclerView() {
        val recyclerView = recyclerView
        recyclerView.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = ProductAdapter(getProducts())
        }
    }

    private fun getProducts(): List<Product> {
        return listOf(
            Product(
                "HP Deskjet Ink",
                799.0,
                R.drawable.hp_1
            ),
            Product(
                "HP LaserJet",
                50.0,
                R.drawable.hp_2
            ),
            Product(
                "HP All in one",
                200.60,
                R.drawable.hp_3
            ),
            Product(
                "HP Multi",
                100.0,
                R.drawable.hp_4
            )
        )
    }
}
