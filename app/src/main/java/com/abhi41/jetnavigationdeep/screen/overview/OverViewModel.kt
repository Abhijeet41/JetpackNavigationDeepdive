package com.abhi41.jetnavigationdeep.screen.overview

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.abhi41.jetnavigationdeep.util.Constants
import com.abhi41.jetnavigationdeep.util.Constants.OVERVIEW_ARGUMENT_ID
import com.abhi41.jetnavigationdeep.util.Constants.OVERVIEW_ARGUMENT_NAME
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private const val TAG = "OverViewModel"
@HiltViewModel
class OverViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel(){

    init {
        val id =savedStateHandle.get<Int>(OVERVIEW_ARGUMENT_ID).toString()
        val name = savedStateHandle.get<String>(OVERVIEW_ARGUMENT_NAME)
        Log.d(TAG, "savedState: $id")
        Log.d(TAG, "savedState Name: $name")
    }
}