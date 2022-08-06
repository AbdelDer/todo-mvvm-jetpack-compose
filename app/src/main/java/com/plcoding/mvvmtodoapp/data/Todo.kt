package com.plcoding.mvvmtodoapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val title: String,
    val description: String?,
    @ColumnInfo(name = "is_done") val isDone: Boolean?,
    @PrimaryKey val id: Int? = null
)
