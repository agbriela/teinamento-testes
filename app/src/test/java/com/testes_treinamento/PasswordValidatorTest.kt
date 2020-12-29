package com.testes_treinamento

import org.junit.Assert
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PasswordValidatorTest  {
    private val passwordValidator = PasswordValidator()

    @Test
    fun givenPasswordShorterThan8_whenValidate_shouldReturnFalse(){
        // arrange
        //isolado na private val

        // act
        val result = passwordValidator.isValid("aB3.567")

        // assert
        assertFalse(result)
    }

    @Test
    fun givenPasswordDoesntContainUpperCase_whenValidate_shouldReturnFalse(){
        // arrange
        //isolado na private val

        // act
        val result = passwordValidator.isValid("ab3.5678av")

        // assert
        assertFalse(result)
    }

    @Test
    fun givenPasswordDoesntContainLowerCase_whenValidate_shouldReturnFalse(){
        //arrange
        //isolado na private val

        //act
        val result = passwordValidator.isValid("AB3.5678AV")

        //assert
        assertFalse(result)

    }

    @Test
    fun givenPasswordDoesntContainSpecialCharacter_whenValidate_shouldReturnFalse(){
        // arrange
        //isolado na private val

        //act
        val result  = passwordValidator.isValid("AB3g5678Av")
        //assert
        assertFalse(result)
    }
    @Test
    fun givenPasswordDoesntContainsNumber_whenValidate_shouldReturnFalse(){
        // arrange
        //isolado na private val

        //act
        val result  = passwordValidator.isValid("ABag...AaaaAv")
        //assert
        assertFalse(result)
    }

    @Test
    fun givenPasswordIsValid_whenValidate_shouldReturnTrue(){
        // arrange
        //isolado na private val

        //act
        val result  = passwordValidator.isValid("Ab3.kbuire")
        //assert
        assertTrue(result)
    }

}