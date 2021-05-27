package com.kotlin.multimodulespringboot

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MultiModuleSpringBootApplicationTests {

    @Test
    fun learnBackendTest() {
        assertEquals("learnBackend", learnBackend())
    }

}
