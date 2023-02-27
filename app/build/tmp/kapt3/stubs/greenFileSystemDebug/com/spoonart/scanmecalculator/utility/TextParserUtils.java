package com.spoonart.scanmecalculator.utility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/spoonart/scanmecalculator/utility/TextParserUtils;", "", "()V", "operators", "Ljava/util/HashMap;", "", "Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Arithmetic;", "calculate", "", "source", "Arithmetic", "Divide", "Minus", "Plus", "Times", "app_greenFileSystemDebug"})
public final class TextParserUtils {
    private final java.util.HashMap<java.lang.String, com.spoonart.scanmecalculator.utility.TextParserUtils.Arithmetic> operators = null;
    
    public TextParserUtils() {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
    public final double calculate(@org.jetbrains.annotations.NotNull()
    java.lang.String source) throws java.lang.IllegalArgumentException {
        return 0.0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Arithmetic;", "", "()V", "apply", "", "a", "b", "app_greenFileSystemDebug"})
    static abstract class Arithmetic {
        
        public Arithmetic() {
            super();
        }
        
        public abstract double apply(double a, double b);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Plus;", "Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Arithmetic;", "()V", "apply", "", "a", "b", "app_greenFileSystemDebug"})
    static final class Plus extends com.spoonart.scanmecalculator.utility.TextParserUtils.Arithmetic {
        
        public Plus() {
            super();
        }
        
        @java.lang.Override()
        public double apply(double a, double b) {
            return 0.0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Minus;", "Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Arithmetic;", "()V", "apply", "", "a", "b", "app_greenFileSystemDebug"})
    static final class Minus extends com.spoonart.scanmecalculator.utility.TextParserUtils.Arithmetic {
        
        public Minus() {
            super();
        }
        
        @java.lang.Override()
        public double apply(double a, double b) {
            return 0.0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Times;", "Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Arithmetic;", "()V", "apply", "", "a", "b", "app_greenFileSystemDebug"})
    static final class Times extends com.spoonart.scanmecalculator.utility.TextParserUtils.Arithmetic {
        
        public Times() {
            super();
        }
        
        @java.lang.Override()
        public double apply(double a, double b) {
            return 0.0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Divide;", "Lcom/spoonart/scanmecalculator/utility/TextParserUtils$Arithmetic;", "()V", "apply", "", "a", "b", "app_greenFileSystemDebug"})
    static final class Divide extends com.spoonart.scanmecalculator.utility.TextParserUtils.Arithmetic {
        
        public Divide() {
            super();
        }
        
        @java.lang.Override()
        public double apply(double a, double b) {
            return 0.0;
        }
    }
}