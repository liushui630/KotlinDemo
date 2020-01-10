package com.zhengjy.example.kotlindemo.base

object StringTest {
    fun test() {
        val arr = "www.github.com".split(".")
        println(arr.size) // size = 3
        val path = "/Users/chiclaim/kotlin-book/kotlin-in-action.doc"
        parsePathRegexp(path)
        parsePath(path)
    }

    fun parsePath(path: String) {
        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")
        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")
        println("Dir: $directory, name: $fileName, ext: $extension")
    }

    fun parsePathRegexp(path: String) {
        val regex = """(.+)/(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)
/*        if (matchResult != null) {
            val (directory, filename, extension) = matchResult.destructured
            println("Dir: $directory, name: $filename, ext: $extension")
        }*/
    }
}




