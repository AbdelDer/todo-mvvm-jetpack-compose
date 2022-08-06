package com.plcoding.mvvmtodoapp.data

import androidx.room.Database

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase {
    abstract val dao: TodoDao
}