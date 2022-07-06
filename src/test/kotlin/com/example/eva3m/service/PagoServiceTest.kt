package com.example.eva3m.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PagoServiceTest {

    @Autowired
    lateinit var pagoService: PagoService

    @Test
    fun formatoPlacaValida(){
        val response = pagoService.formatoPlaca("AGD-0778")
        Assertions.assertEquals(true,response)
    }
    @Test
    fun formatoPlacaInValida(){
        val response = pagoService.formatoPlaca("AG-778")
        Assertions.assertEquals(false,response)
    }
    @Test
    fun provinciaValida(){

    }
    @Test
    fun provinciaInvalida(){

    }
    @Test
    fun pagoBaseCorrecto(){

    }

    @Test
    fun pagoBaseIncorrecto(){

    }
    @Test
    fun pagoBaseContaminaCorrecto(){

    }
    @Test
    fun pagoBaseContaminaIncorrecto(){

    }
}