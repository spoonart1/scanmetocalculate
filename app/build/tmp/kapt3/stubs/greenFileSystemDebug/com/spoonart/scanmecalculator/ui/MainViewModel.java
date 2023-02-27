package com.spoonart.scanmecalculator.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0016\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020\u001fJ\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0002J \u0010+\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010,\u001a\u00020-R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/spoonart/scanmecalculator/ui/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/spoonart/scanmecalculator/data/ProblemRepository;", "textAnalyzer", "Lcom/spoonart/scanmecalculator/utility/TextAnalyzer;", "textParserUtils", "Lcom/spoonart/scanmecalculator/utility/TextParserUtils;", "(Lcom/spoonart/scanmecalculator/data/ProblemRepository;Lcom/spoonart/scanmecalculator/utility/TextAnalyzer;Lcom/spoonart/scanmecalculator/utility/TextParserUtils;)V", "_databaseResult", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/spoonart/scanmecalculator/data/model/ItemFileData;", "_errorState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/spoonart/scanmecalculator/data/model/ErrorData;", "_resultState", "Lcom/spoonart/scanmecalculator/data/model/ItemDisplayData;", "databaseResult", "Lkotlinx/coroutines/flow/StateFlow;", "getDatabaseResult", "()Lkotlinx/coroutines/flow/StateFlow;", "errorState", "Lkotlinx/coroutines/flow/SharedFlow;", "getErrorState", "()Lkotlinx/coroutines/flow/SharedFlow;", "itemDisplayDataList", "", "resultState", "getResultState", "calculate", "", "source", "", "loadAndScanImage", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "loadProblemsFromDatabase", "save", "file", "Ljava/io/File;", "scanImage", "autoSave", "", "app_greenFileSystemDebug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.spoonart.scanmecalculator.data.ProblemRepository repository = null;
    private final com.spoonart.scanmecalculator.utility.TextAnalyzer textAnalyzer = null;
    private final com.spoonart.scanmecalculator.utility.TextParserUtils textParserUtils = null;
    private final java.util.List<com.spoonart.scanmecalculator.data.model.ItemDisplayData> itemDisplayDataList = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.spoonart.scanmecalculator.data.model.ErrorData> _errorState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.spoonart.scanmecalculator.data.model.ItemDisplayData>> _resultState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.spoonart.scanmecalculator.data.model.ItemFileData>> _databaseResult = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.spoonart.scanmecalculator.data.model.ItemDisplayData>> resultState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.spoonart.scanmecalculator.data.model.ErrorData> errorState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.spoonart.scanmecalculator.data.model.ItemFileData>> databaseResult = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.spoonart.scanmecalculator.data.ProblemRepository repository, @org.jetbrains.annotations.NotNull()
    com.spoonart.scanmecalculator.utility.TextAnalyzer textAnalyzer, @org.jetbrains.annotations.NotNull()
    com.spoonart.scanmecalculator.utility.TextParserUtils textParserUtils) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.spoonart.scanmecalculator.data.model.ItemDisplayData>> getResultState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.spoonart.scanmecalculator.data.model.ErrorData> getErrorState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.spoonart.scanmecalculator.data.model.ItemFileData>> getDatabaseResult() {
        return null;
    }
    
    public final void loadProblemsFromDatabase() {
    }
    
    public final void loadAndScanImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public final void scanImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, boolean autoSave) {
    }
    
    private final void calculate(java.lang.String source) {
    }
    
    private final void save(java.io.File file) {
    }
}