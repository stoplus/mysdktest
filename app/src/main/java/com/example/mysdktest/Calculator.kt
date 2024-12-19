package com.example.mysdktest

interface ICalculator {

    /** Sum 2 Int elements.
     *  @param element First element.
     *  @param elementTwo Second element.
     *  @return Sum 2 Int elements.
     **/
    fun intPlus(element: Int, elementTwo: Int): Int
}

class Calculator : ICalculator {

    override fun intPlus(first: Int, second: Int): Int {
        return first + second
    }
}