package com.omelchenkoaleks.coursepetrovnotes.database.room

import androidx.lifecycle.LiveData
import com.omelchenkoaleks.coursepetrovnotes.database.DatabaseRepository
import com.omelchenkoaleks.coursepetrovnotes.models.AppNote

class AppRoomRepository(private val appRoomDao: AppRoomDao) : DatabaseRepository {
    override val allNotes: LiveData<List<AppNote>>
        get() = appRoomDao.getAllNotes()

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.insert(note)
        onSuccess()
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        appRoomDao.delete(note)
        onSuccess()
    }
}