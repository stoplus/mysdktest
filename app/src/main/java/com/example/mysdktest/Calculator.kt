package com.example.mysdktest

interface ICalculator {

    fun plusDouble(element: Double, elementTwo: Double): Double
}

class Calculator : ICalculator {

    override fun plusDouble(element: Double, elementTwo: Double): Double {
        return elementTwo + element
    }
}