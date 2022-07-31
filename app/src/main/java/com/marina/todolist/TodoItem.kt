package com.marina.todolist

data class TodoItem(
    val id: String,
    var text: String,
    var importance: Importance,
    var deadline: Long?,
    var isDone: Boolean,
    val creationDate: Long,
    var lastChangeDate: Long?
) {
    enum class Importance {
        LOW, ORDINARY, HIGH
    }
}
