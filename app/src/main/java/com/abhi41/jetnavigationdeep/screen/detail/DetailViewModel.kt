package com.abhi41.jetnavigationdeep.screen.detail

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.abhi41.jetnavigationdeep.util.Constants
import com.abhi41.jetnavigationdeep.util.Constants.DETAIL_ARGUMENT_ID
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private const val TAG = "DetailViewModel"

@HiltViewModel
class DetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel(){

    init {
        val id =savedStateHandle.get<Int>(DETAIL_ARGUMENT_ID).toString()
        Log.d(TAG, "savedState: $id")
    }

}