package com.spoonart.scanmecalculator.data

import com.spoonart.scanmecalculator.data.entity.ProblemEntity
import com.spoonart.scanmecalculator.database.dao.ProblemDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

interface ProblemRepository {
    suspend fun getData(): Flow<List<ProblemEntity>>

    suspend fun saveData(data: ProblemEntity): Flow<Boolean>
}

class ProblemRepositoryImpl @Inject constructor(
    private val problemDao: ProblemDao,
) : ProblemRepository {
    override suspend fun getData() = flow {
        emit(problemDao.getData())
    }.flowOn(Dispatchers.IO)

    override suspend fun saveData(data: ProblemEntity) = flow {
        emit(
            try {
                problemDao.save(data) > 0L
            } catch (e: Exception) {
                false
            }
        )
    }.flowOn(Dispatchers.IO)
}
