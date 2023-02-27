package com.spoonart.scanmecalculator.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.spoonart.scanmecalculator.data.entity.ProblemEntity

@Dao
interface ProblemDao {

    @Query("SELECT * FROM problem")
    fun getData(): List<ProblemEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(data: ProblemEntity): Long
}
