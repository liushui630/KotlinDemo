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

    fun varDemo() {
        // 定义一个可以被修改的变量
        var age : Int = 17
        // 定义一个不可修改的变量
        val id : Int = 1000

        // 还可以省略变量类型
        // Kotlin会类型推导出变量的类型
        var age2 = 17
        val id2 = 1000

        //需要注意的是，val 表示该变量 引用不可变，但是对象里的内容可以变



    }

    //在 Java 中使用 enum 关键定义枚举类
    //Kotlin 使用 enume class 来定义枚举类
    enum class Color(val r: Int, val g: Int, val b: Int ){ //枚举常量属性

        // 定义枚举常量对象
        RED(255, 0, 0), ORANGE(255, 165, 0),
        YELLOW(255, 255, 0), GREEN(0, 255, 0),
        BLUE(0, 0, 255), INDIGO(75, 0, 130),
        VIOLET(238, 130, 238); //最后一个枚举对象需要分号结尾

        // 在枚举类中定义函数
        fun rgb() = (r * 256 + g) * 256 + b
    }


}