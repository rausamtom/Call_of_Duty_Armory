package com.application.callofdutyarmory.weapons

data class MwWeapon (
    val weapon : String,
    val category : String,
    val caliber : String,
    val preview : String,
    val description : String,
    var isFavorite : Boolean = false
)
