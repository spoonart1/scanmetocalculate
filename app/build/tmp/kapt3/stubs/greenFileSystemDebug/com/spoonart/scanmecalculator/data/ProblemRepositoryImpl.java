package com.spoonart.scanmecalculator.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/spoonart/scanmecalculator/data/ProblemRepositoryImpl;", "Lcom/spoonart/scanmecalculator/data/ProblemRepository;", "problemDao", "Lcom/spoonart/scanmecalculator/database/dao/ProblemDao;", "(Lcom/spoonart/scanmecalculator/database/dao/ProblemDao;)V", "getData", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/spoonart/scanmecalculator/data/entity/ProblemEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveData", "", "data", "(Lcom/spoonart/scanmecalculator/data/entity/ProblemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_greenFileSystemDebug"})
public final class ProblemRepositoryImpl implements com.spoonart.scanmecalculator.data.ProblemRepository {
    private final com.spoonart.scanmecalculator.database.dao.ProblemDao problemDao = null;
    
    @javax.inject.Inject()
    public ProblemRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.spoonart.scanmecalculator.database.dao.ProblemDao problemDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.spoonart.scanmecalculator.data.entity.ProblemEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveData(@org.jetbrains.annotations.NotNull()
    com.spoonart.scanmecalculator.data.entity.ProblemEntity data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> continuation) {
        return null;
    }
}