package com.example.kotlinroomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val name : String,
    val phone : String,
    val isCreated : String,
    val isActive : Int
)