package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        val strBuilder = StringBuilder();
        if (inputNumber % 3 == 0) {
            strBuilder.append("Foo")
        }
        if (inputNumber % 5 == 0) {
            strBuilder.append("Bar")
        }
        if (inputNumber % 7 == 0) {
            strBuilder.append("Quix")
        }
        val numberInString: String = inputNumber.toString()
        for (element in numberInString) {
            when (element) {
                '0' -> {
                    strBuilder.append("Buzz")
                }
                '3' -> {
                    strBuilder.append("Foo")
                }
                '5' -> {
                    strBuilder.append("Bar")
                }
                '7' -> {
                    strBuilder.append("Quix")
                }
            }
        }
        val result = strBuilder.toString()

        return result.ifBlank {
            numberInString
        }
    }

}