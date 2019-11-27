package br.com.soluevo.nikemodule

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.soluevo.nikemodule.model.Product
import java.text.NumberFormat
import java.util.*

class ProductAdapter(private val objects: List<Product>) : RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int = objects.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = objects[position]
        holder.bind(item)
    }


}

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {

    private var mProductImageView: ImageView? = null
    private var mProductNameView: TextView? = null
    private var mProductPriceView: TextView? = null


    init {
        mProductImageView = itemView.findViewById(R.id.product_image)
        mProductNameView = itemView.findViewById(R.id.product_name)
        mProductPriceView = itemView.findViewById(R.id.product_price)
    }

    fun bind(item: Product) {
        mProductImageView?.setImageResource(item.imageResource)
        mProductNameView?.text = item.name
        mProductPriceView?.text =
            NumberFormat.getCurrencyInstance(Locale("pt", "BR")).format(item.price)
    }

}