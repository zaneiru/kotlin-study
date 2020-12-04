package com.study.example

class main

class BlueberryCupcake {
    var flavour = "블루베리"
}

class biscuit(val flavour: String) {
    fun eat(): String {
        return "냠냠냠 맛있는 $flavour 비스킷"
    }
}

open class Bakery(val flavour: String) {
    fun eat(): String {
        return "맛있는 베이커리 $flavour 제품"
    }
}

class CupCake(flavour: String): Bakery(flavour)
class BisCuit(flavour: String): Bakery(flavour)

fun main(args: Array<String>) {
    val main = main()
    val myCupcake = BlueberryCupcake()
    myCupcake.flavour = "아몬드"
    println("내 컵 케이크에는 ${myCupcake.flavour} 가 있다.")

    val cupCake = CupCake("초콜렛")
    println(cupCake.eat())
}