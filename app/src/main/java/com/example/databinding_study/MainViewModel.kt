package com.example.databinding_study

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    val todoLiveData = MutableLiveData<List<Todo>>()

    private val data = arrayListOf<Todo>()


    fun addTodo(todo: Todo) {
        data.add(todo)
        // 값을 변경
        todoLiveData.value = data
    }

    fun deleteTodo(todo: Todo) {
        data.remove(todo)
        todoLiveData.value = data

    }

    fun toggleTodo(todo: Todo) {
        todo.isDone = !todo.isDone
        todoLiveData.value = data

    }


}