package com.spoonart.scanmecalculator.utility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002JL\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0016J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/spoonart/scanmecalculator/utility/TextAnalyzerImpl;", "Lcom/spoonart/scanmecalculator/utility/TextAnalyzer;", "()V", "recognizer", "Lcom/google/mlkit/vision/text/TextRecognizer;", "getRecognizer", "()Lcom/google/mlkit/vision/text/TextRecognizer;", "recognizer$delegate", "Lkotlin/Lazy;", "analyzeImage", "", "context", "Landroid/content/Context;", "fromFile", "Landroid/net/Uri;", "fromBitmap", "Landroid/graphics/Bitmap;", "onSuccess", "Lkotlin/Function1;", "", "onFailure", "getImage", "Lcom/google/mlkit/vision/common/InputImage;", "app_greenFileSystemDebug"})
public final class TextAnalyzerImpl implements com.spoonart.scanmecalculator.utility.TextAnalyzer {
    private final kotlin.Lazy recognizer$delegate = null;
    
    @javax.inject.Inject()
    public TextAnalyzerImpl() {
        super();
    }
    
    private final com.google.mlkit.vision.text.TextRecognizer getRecognizer() {
        return null;
    }
    
    @java.lang.Override()
    public void analyzeImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri fromFile, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap fromBitmap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
    }
    
    private final com.google.mlkit.vision.common.InputImage getImage(android.content.Context context, android.net.Uri fromFile, android.graphics.Bitmap fromBitmap) {
        return null;
    }
}