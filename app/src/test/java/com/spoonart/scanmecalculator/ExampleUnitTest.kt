package com.spoonart.scanmecalculator

import com.spoonart.scanmecalculator.protector.decrypt
import com.spoonart.scanmecalculator.protector.encrypt
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        val source = "Halo"
        val encrypt = source.encrypt()
        println("res: $encrypt")

        val decrypt = encrypt.decrypt()
        println("res: $decrypt")
    }
}
