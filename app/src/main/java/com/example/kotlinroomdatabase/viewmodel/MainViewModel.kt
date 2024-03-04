package com.example.kotlinroomdatabase.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlinroomdatabase.db.QuoteDatabase
import com.example.kotlinroomdatabase.models.QuoteList
import com.example.kotlinroomdatabase.repository.QuoteRepository
import com.example.kotlinroomdatabase.repository.Response
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository : QuoteRepository) : ViewModel(){

    init{
        viewModelScope.launch(Dispatchers.IO) {
            repository.getQuotes(1)
        }
    }

    val quotes : LiveData<Response<QuoteList>>
    get() = repository.quoteLiveData
}