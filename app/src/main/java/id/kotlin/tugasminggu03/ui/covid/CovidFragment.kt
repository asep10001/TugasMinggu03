package id.kotlin.tugasminggu03.ui.covid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import id.kotlin.tugasminggu03.R

class CovidFragment : Fragment() {

    private lateinit var covidViewModel: CovidViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        covidViewModel =
            ViewModelProviders.of(this).get(CovidViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_covid, container, false)
        val textView: TextView = root.findViewById(R.id.textCovid)
        val imageView: ImageView = root.findViewById(R.id.imageCovid19)
        covidViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        covidViewModel.src.observe(viewLifecycleOwner, {
            imageView.setImageResource(it)
        })
        return root
    }
}
