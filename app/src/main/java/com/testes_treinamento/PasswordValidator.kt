package com.testes_treinamento

import java.util.*

class PasswordValidator {

    private val validations = listOf(
        "[a-z]",
        "[A-Z]",
        "[0-9]",
        "[\\W]",
        "[\\w\\W]{8,}"
    ).map { it.toRegex() }

    fun isValid(password: String) = validations.all {

        validations.forEach { validation ->
            val result = password.contains(validation)

            if (!result) {
                return false
            }
        }
        return true
    }
}
//
//    fun upperCase(password: String): Boolean {
//        val toTypedArray = password.split(",").toTypedArray()
//        val map = toTypedArray.map { item ->
//            item == item.toUpperCase()
//        }
//        return map.contains(true)
//
//    }
//
//
//    fun lowerCase(password: String): Boolean {
//        val toTypedArray = password.split(",").toTypedArray()
//        val map = toTypedArray.map { item ->
//            item == item.toLowerCase()
//        }
//        return map.contains(true)
//    }
//
////    fun haveNum (password: String): Boolean{
////        return password.contains(equals(Int)) }


