package com.study.example.example_when


class WhenExample() {
    // case 1
    fun when_case1() {
        val v = 0
        when (v) {
            0 -> println("0")
            1 -> println("1")
            2 -> println("2")
            else -> print("default")
        }
    }

    // case 1
    fun when_case2() {
        val v = 0
        when (v) {
            0, 1 -> println("0 or 1")
            2 -> println("2")
            else -> print("default")
        }
    }
}


fun main (args: Array<String>) {
    val whenExample = WhenExample()
    whenExample.when_case1() // 0 이기 때문에 0만 찍히는걸로 된다.
    whenExample.when_case2() // 0 이기 때문에 0 or 1찍히는걸로 된다.
}

