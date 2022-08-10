package com.plcoding.mvvmtodoapp.data

import kotlinx.coroutines.flow.Flow

class TodoRepositoryImpl(
     val todoDao: TodoDao
) : TodoRepository {
    override suspend fun insertTodo(todo: Todo) {
        todoDao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        todoDao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return todoDao.getTodoById(id)
    }

    override fun getTodos(): Flow<List<Todo>> {
        return todoDao.getTodos()
    }
}