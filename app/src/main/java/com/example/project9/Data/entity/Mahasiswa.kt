package com.example.project9.Data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mahasiswa")
data class Mahasiswa (
    @PrimaryKey
    val nim: String,
    val nama: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String
)