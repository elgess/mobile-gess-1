package com.example.gesslaba1

import java.util.*
import kotlin.random.Random

class NumberExercise {
    private val numbers: List<Double> = List(10){ Random.nextDouble(1.0 , 50.0) }

    fun normalize() : String {
        val temp : Vector<Double> = Vector()
        val max = numbers.max()
        val min = numbers.min()
        for (it in numbers){
            temp.add((it - min!!)/(max!! - min!!))
        }
        return temp.toString()
    }
}