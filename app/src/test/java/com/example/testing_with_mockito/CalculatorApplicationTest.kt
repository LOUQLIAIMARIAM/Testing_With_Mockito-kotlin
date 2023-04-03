package com.example.testing_with_mockito

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.junit.Assert
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorApplicationTest {

    //@InjectMocks annotation est utilisée pour créer et injecter l'objet fictif
    @InjectMocks
    var calculatorApplication: CalculatorApplication = CalculatorApplication()
    //@Mock annotation est utilisée pour créer l'objet fictif à injecter
    @Mock
    lateinit var calcService: CalculatorService

    @Test
    fun testAdd() {
        // ajouter le comportement de calcService pour additionner deux nombres
        `when`(calcService.add(10.0,20.0)).thenReturn(30.00)
        // tester la fonctionnalité d'ajout
        Assert.assertEquals(calculatorApplication.add(10.0, 20.0),30.0,0.0)
    }
}



