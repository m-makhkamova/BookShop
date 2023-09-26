package itschool.uz.adapter

import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ProductRecyclerAdapter(var productList:MutableList<Product>):RecyclerView.Adapter<ProductRecyclerAdapter.MyHolder> {
    class MyHolder(itemView: ItemView):RecyclerView.ViewHolder(itemView){

    }
}