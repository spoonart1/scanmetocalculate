package com.spoonart.scanmecalculator.protector

import org.apache.commons.codec.binary.Base64


interface Protector {
    fun encrypt(source: String): String

    fun decrypt(source: String): String
}

internal class ProtectorImpl(
    private val configuration: Configuration = Configuration()
) : Protector {
    override fun encrypt(source: String): String {
        val crypt = configuration.cipherEncrypt().doFinal(source.toByteArray())
        val encodedByte = Base64.encodeBase64(crypt)
        return String(encodedByte)
    }
    override fun decrypt(source: String): String {
        val decodedByte = Base64.decodeBase64(source)
        val decrypt = configuration.cipherDecrypt().doFinal(decodedByte)
        return String(decrypt)
    }
}
