package com.spoonart.scanmecalculator.utility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0015\b\u0002\u0010\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u00a2\u0006\u0002\b\u0004H\u0007\u001a4\u0010\u0000\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\b\u0004H\u0003\u00a2\u0006\u0002\u0010\u000b\u001a#\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"AskPermission", "", "onGranted", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "permissions", "", "", "onCheckResult", "Lkotlin/Function1;", "", "([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "hasPermissions", "context", "Landroid/content/Context;", "(Landroid/content/Context;[Ljava/lang/String;)Z", "app_greenFileSystemDebug"})
public final class PermissionUtilsKt {
    
    @androidx.compose.runtime.Composable()
    public static final void AskPermission(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onGranted) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void AskPermission(java.lang.String[] permissions, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCheckResult) {
    }
    
    private static final boolean hasPermissions(android.content.Context context, java.lang.String[] permissions) {
        return false;
    }
}