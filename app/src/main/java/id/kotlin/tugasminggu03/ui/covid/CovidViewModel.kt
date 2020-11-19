package id.kotlin.tugasminggu03.ui.covid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.kotlin.tugasminggu03.R

class CovidViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is gallery Fragment"
    }
    private val _src = MutableLiveData<Int>().apply {
        value = R.drawable.ic_launcher_background
    }
    val text: LiveData<String> = _text
    val src: LiveData<Int> = _src
}