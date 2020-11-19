package id.kotlin.tugasminggu03.ui.museum

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import id.kotlin.tugasminggu03.R

class MuseumFragment : Fragment() {

    private lateinit var museumViewModel: MuseumViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        museumViewModel =
                ViewModelProviders.of(this).get(MuseumViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_museum, container, false)
        val textView: TextView = root.findViewById(R.id.textMuseum)
        museumViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
