package com.omelchenkoaleks.coursepetrovnotes.database

import androidx.lifecycle.LiveData
import com.omelchenkoaleks.coursepetrovnotes.models.AppNote

interface DatabaseRepository {
    val allNotes: LiveData<List<AppNote>>
    suspend fun insert(note: AppNote, onSuccess: () -> Unit)
    suspend fun delete(note: AppNote, onSuccess: () -> Unit)
}