package itschool.uz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import itschool.uz.adapter.ProductRecyclerAdapter
import itschool.uz.databinding.FragmentProductItemBinding

private const val ARG_PARAM1 = "param1"

class ProductItemFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var productList = mutableListOf<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentProductItemBinding.inflate(inflater, container, false)
        var layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productRv.layoutManager = layoutManager
        loadList()
        if(param1=="Barchasi"){
              binding.productRv.adapter = ProductRecyclerAdapter(productList)
        }else {
            binding.productRv.adapter = ProductRecyclerAdapter(productList.filter { it.type == param1 } as MutableList<Product>)
        }
        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String) =
            ProductItemFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }
    private fun loadList() {
        for (i in 0..9) {
            productList.add(Product("O'tkan kunlar", "Abdulla Qodiriy", R.drawable.otkan, 0.0, "Badiiy kitoblar")
            productList.add(Product("Yulduzli tunlar", "Pirimqul Qodirov", R.drawable.yulduzli, 0.0, "Badiiy kitoblar")
            productList.add(Product("Ikki eshik orasi", "O'tkir Hoshimov", R.drawable.ikki_eshik, 0.0, "Badiiy kitoblar")
            productList.add(Product("Urush tugasa, ayting, qaytib kelaman", "Qo'chqor Norqobil", R.drawable.urush, 0.0, "Badiiy kitoblar")
            productList.add(Product("Iymon", "Shayx Muhammadsodiq", R.drawable.urush, 0.0, "Badiiy kitoblar")

        }
    }
}