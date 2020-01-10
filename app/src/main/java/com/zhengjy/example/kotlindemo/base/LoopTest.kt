package com.zhengjy.example.kotlindemo.base

object LoopTest {

    fun test() {

        for (i in 0..30) {
            print("$i ")
        }

        println()
        println("-------------")

        for (i in 30 downTo 0 step 2) {
            print("$i, ")
        }

        println()
        println("-------------")

        for (i in 0 until 30) {
            print("$i ")

        }
        println()
        println("--------------")
    }
}
