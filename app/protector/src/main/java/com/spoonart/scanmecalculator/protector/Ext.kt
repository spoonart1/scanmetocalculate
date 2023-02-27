package com.spoonart.scanmecalculator.protector

private val protector by lazy {
    ProtectorImpl()
}

fun String.encrypt() = protector.encrypt(this)

fun String.decrypt() = protector.decrypt(this)
