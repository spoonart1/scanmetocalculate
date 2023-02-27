package com.spoonart.scanmecalculator.data.model

data class ErrorData(
    val pid: Long,
    val message: String,
) {
    companion object {
        fun create(message: String): ErrorData {
            return ErrorData(pid = System.currentTimeMillis(), message = message)
        }
    }
}
