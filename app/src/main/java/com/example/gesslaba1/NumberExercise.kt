package com.example.gesslaba1

import kotlin.random.Random

class NumberExercise {
    private val numbers: List<Double> = List(10){ Random.nextDouble(1.0 , 50.0) }

    fun normalize() : String {
        val max = numbers.max()
        val min = numbers.min()
        return numbers.map{ it to (it - min!!)/(max!! - min!!)}.toMap().values.toString()
    }
}

