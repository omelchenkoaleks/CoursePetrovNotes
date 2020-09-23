package com.omelchenkoaleks.coursepetrovnotes.utilits

import com.omelchenkoaleks.coursepetrovnotes.MainActivity
import com.omelchenkoaleks.coursepetrovnotes.database.DatabaseRepository

lateinit var APP_ACTIVITY: MainActivity
lateinit var REPOSITORY: DatabaseRepository
const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"