package com.spoonart.scanmecalculator.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/spoonart/scanmecalculator/di/AppModule;", "", "()V", "provideDb", "Lcom/spoonart/scanmecalculator/database/AppDatabase;", "context", "Landroid/content/Context;", "provideRepository", "Lcom/spoonart/scanmecalculator/data/ProblemRepository;", "database", "provideTextAnalyzer", "Lcom/spoonart/scanmecalculator/utility/TextAnalyzer;", "providesTextParserUtils", "Lcom/spoonart/scanmecalculator/utility/TextParserUtils;", "app_greenFileSystemDebug"})
@dagger.Module()
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.spoonart.scanmecalculator.database.AppDatabase provideDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final com.spoonart.scanmecalculator.data.ProblemRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.spoonart.scanmecalculator.database.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final com.spoonart.scanmecalculator.utility.TextAnalyzer provideTextAnalyzer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.spoonart.scanmecalculator.utility.TextParserUtils providesTextParserUtils() {
        return null;
    }
}