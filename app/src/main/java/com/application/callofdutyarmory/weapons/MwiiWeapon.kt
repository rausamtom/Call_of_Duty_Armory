package com.application.callofdutyarmory.weapons

data class MwiiWeapon (
    val weapon : String,
    val platform : String,
    val category : String,
    val caliber : String,
    val preview : String,
    val description : String,
    var isFavorite : Boolean = false
)
