package com.spoonart.scanmecalculator.di

import android.content.Context
import com.spoonart.scanmecalculator.data.ProblemRepository
import com.spoonart.scanmecalculator.data.ProblemRepositoryImpl
import com.spoonart.scanmecalculator.database.AppDatabase
import com.spoonart.scanmecalculator.utility.TextAnalyzer
import com.spoonart.scanmecalculator.utility.TextAnalyzerImpl
import com.spoonart.scanmecalculator.utility.TextParserUtils
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDb(
        @ApplicationContext context: Context,
    ) = AppDatabase.getInstance(context)

    @Provides
    @Reusable
    fun provideRepository(
        database: AppDatabase,
    ): ProblemRepository = ProblemRepositoryImpl(
        problemDao = database.problemDao()
    )

    @Provides
    @Reusable
    fun provideTextAnalyzer(): TextAnalyzer {
        return TextAnalyzerImpl()
    }

    @Provides
    @Singleton
    fun providesTextParserUtils() = TextParserUtils()

}
