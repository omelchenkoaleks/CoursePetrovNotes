package com.omelchenkoaleks.coursepetrovnotes.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.omelchenkoaleks.coursepetrovnotes.database.room.AppRoomDatabase
import com.omelchenkoaleks.coursepetrovnotes.database.room.AppRoomRepository
import com.omelchenkoaleks.coursepetrovnotes.utilits.REPOSITORY
import com.omelchenkoaleks.coursepetrovnotes.utilits.TYPE_ROOM

class StartFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type: String, onSuccess: () -> Unit) {
        when (type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
        }
    }
}