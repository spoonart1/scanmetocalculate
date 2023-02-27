package com.spoonart.scanmecalculator.protector

import org.apache.commons.codec.binary.Base64
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.PBEKeySpec
import javax.crypto.spec.SecretKeySpec


class Configuration {

    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }

    private external fun secretKey(): String

    private external fun salt(): String

    private external fun iv(): String

    internal fun cipherEncrypt(): Cipher {
        val ivParameterSpec = IvParameterSpec(Base64.decodeBase64(iv()))
        val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
        val spec = PBEKeySpec(secretKey().toCharArray(), Base64.decodeBase64(salt()), 10000, 256)
        val tmp = factory.generateSecret(spec)
        val secretKey = SecretKeySpec(tmp.encoded, "AES")

        val cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING")
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec)
        return cipher
    }

    internal fun cipherDecrypt(): Cipher {
        val ivParameterSpec = IvParameterSpec(Base64.decodeBase64(iv()))
        val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
        val spec = PBEKeySpec(secretKey().toCharArray(), Base64.decodeBase64(salt()), 10000, 256)
        val tmp = factory.generateSecret(spec);
        val secretKey = SecretKeySpec(tmp.encoded, "AES")

        val cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
        return cipher
    }
}
