package id.kotlin.tugasminggu03.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import id.kotlin.tugasminggu03.R

class BatikFragment : Fragment() {

    private lateinit var batikViewModel: BatikViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        batikViewModel =
                ViewModelProviders.of(this).get(BatikViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_batik, container, false)
        val imgBatik: ImageView = root.findViewById(R.id.roundedImageView)
        batikViewModel.src.observe(viewLifecycleOwner, Observer {
            imgBatik.setImageResource(it)
        })
        return root
    }
}
