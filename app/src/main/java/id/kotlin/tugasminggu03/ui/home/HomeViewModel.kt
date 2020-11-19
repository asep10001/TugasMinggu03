package id.kotlin.tugasminggu03.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.kotlin.tugasminggu03.R

class HomeViewModel : ViewModel() {

    private val _src = MutableLiveData<Int>().apply {
        value = R.drawable.ic_launcher_background
    }

    val src: LiveData<Int> = _src
}