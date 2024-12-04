package com.example.project9.Data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.project9.Data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}