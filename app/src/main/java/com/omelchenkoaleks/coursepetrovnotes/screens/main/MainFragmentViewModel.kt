package com.omelchenkoaleks.coursepetrovnotes.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.omelchenkoaleks.coursepetrovnotes.utilits.REPOSITORY

class MainFragmentViewModel(application: Application) : AndroidViewModel(application) {
    val allNotes = REPOSITORY.allNotes
    fun signOut() {
        REPOSITORY.signOut()
    }
}