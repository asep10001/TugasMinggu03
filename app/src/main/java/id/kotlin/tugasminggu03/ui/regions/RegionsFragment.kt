package id.kotlin.tugasminggu03.ui.regions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import id.kotlin.tugasminggu03.R


class RegionsFragment : Fragment() {

    private lateinit var regionsViewModel: RegionsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        regionsViewModel =
            ViewModelProviders.of(this).get(RegionsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_regions, container, false)
        val textView: TextView = root.findViewById(R.id.textRegions)
        regionsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}