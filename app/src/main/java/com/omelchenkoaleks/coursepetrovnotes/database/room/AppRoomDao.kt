package com.omelchenkoaleks.coursepetrovnotes.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.omelchenkoaleks.coursepetrovnotes.models.AppNote

@Dao
interface AppRoomDao {
    @Query("SELECT * from notes_table")
    fun getAllNotes(): LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: AppNote)

    @Delete
    suspend fun delete(note: AppNote)
}