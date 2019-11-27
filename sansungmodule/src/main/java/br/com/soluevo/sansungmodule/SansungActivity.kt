package br.com.soluevo.sansungmodule

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.soluevo.sansungmodule.model.Product
import kotlinx.android.synthetic.main.activity_sansung.*

class SansungActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sansung)

        setUpToolbar()
        recyclerView()
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
                "Samsung Galaxy",
                799.0,
                R.drawable.samsung_1
            ),
            Product(
                "Samsung G935",
                50.0,
                R.drawable.samsung_2
            ),
            Product(
                "Samsung j4290",
                200.60,
                R.drawable.samsung_3
            ),
            Product(
                "Samsung Notebook",
                100.0,
                R.drawable.samsung_4
            )
        )
    }


}
