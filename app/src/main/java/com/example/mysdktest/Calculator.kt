package com.example.mysdktest

interface ICalculator {

    fun intPlus(element: Int, elementTwo: Int): Int
}

class Calculator : ICalculator {

    override fun intPlus(first: Int, second: Int): Int {
        return first + second
    }
}