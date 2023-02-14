package com.example.showpicsumlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LoremPicsumViewModelFactory(private val repository: LoremPicsumRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoremPicsumViewModel::class.java)) {
            return LoremPicsumViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
