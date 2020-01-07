package com.zhengjy.example.kotlindemo.Utils

import java.io.BufferedReader

class BasicSyntax {
    val a:Int = 1;
    val b:Int = 2;



    //该函数有一个 区块体(block body)
    fun max(a:Int, b:Int) :Int {
        //在Java中if 是语句，在kotlin中是表达式
        val max = if (a > b) a else b
        return max
    }

    //该函数有一个 表达式体(expression body)
    fun max2 (a:Int, b:Int) = if (a > b) a else b

    //在 Java 中 try 异常处理是语句, 在 Kotlin 中它是表达式
    fun readNumber(reader: BufferedReader) {
        //将 try 赋值给 number 变量
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (e: NumberFormatException){
            return
        }
        println(number)
    }


}