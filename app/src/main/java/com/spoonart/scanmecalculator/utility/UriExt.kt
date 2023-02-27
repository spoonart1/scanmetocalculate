package com.spoonart.scanmecalculator.utility

import android.content.Context
import android.net.Uri
import java.io.File

fun Uri.toFile(context: Context): File {
    return FileUtils.getFile(context, this)
}
