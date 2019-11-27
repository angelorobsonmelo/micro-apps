package br.com.soluevo.nikemodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.soluevo.nikemodule.model.Product
import kotlinx.android.synthetic.main.activity_nike.*

class NikeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nike)
        setUpToolbar()
        recyclerView()
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
                "Nike Running",
                799.0,
                R.drawable.nike_1
            ),
            Product(
                "Nike Walking",
                50.0,
                R.drawable.nike_2
            ),
            Product(
                "Nike Nike Flex",
                200.60,
                R.drawable.nike_3
            ),
            Product(
                "Nike Air Zoom",
                100.0,
                R.drawable.nike_4
            )
        )
    }

}
