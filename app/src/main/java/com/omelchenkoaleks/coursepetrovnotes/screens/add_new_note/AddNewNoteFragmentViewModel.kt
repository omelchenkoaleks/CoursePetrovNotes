package com.omelchenkoaleks.coursepetrovnotes.screens.add_new_note

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.omelchenkoaleks.coursepetrovnotes.models.AppNote
import com.omelchenkoaleks.coursepetrovnotes.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddNewNoteFragmentViewModel(application: Application) : AndroidViewModel(application) {
    fun insert(note: AppNote, onSuccess: () -> Unit) {
        viewModelScope.launch(Dispatchers.IO) {
            REPOSITORY.insert(note) {
                onSuccess()
            }
        }
    }
}