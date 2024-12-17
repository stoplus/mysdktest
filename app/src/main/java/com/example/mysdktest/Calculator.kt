package com.example.mysdktest

class Calculator : ICalculator {

    override fun plusDouble(element: Double, elementTwo: Double): Double {
        return elementTwo + element
    }
}

interface ICalculator {

    fun plusDouble(element: Double, elementTwo: Double): Double
}