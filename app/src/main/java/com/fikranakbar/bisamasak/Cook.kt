package com.fikranakbar.bisamasak

data class Cook(
    var name: String = "",
    var description: String = "",
    var ingredient: String = "",
    var step: String = "",
    var photo: Int = 0,
    var isFavorite: Boolean = false
)
