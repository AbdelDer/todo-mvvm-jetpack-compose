package com.plcoding.mvvmtodoapp.di

import android.app.Application
import androidx.room.Room
import com.plcoding.mvvmtodoapp.data.TodoDatabase
import com.plcoding.mvvmtodoapp.data.TodoRepository
import com.plcoding.mvvmtodoapp.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
// this install in define the lifetime of our dependencies
// SingletonComponent::class <=> dependencies will live as long as our application does.
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    private fun provideToDoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db "
        ).build()
    }

    @Provides
    @Singleton
    private fun provideToDoRepository(db: TodoDatabase): TodoRepository {
        return TodoRepositoryImpl(
            db.dao
        )
    }
}