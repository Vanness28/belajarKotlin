package com.vanness.kotlin.oop

open class AnimalProtected (val name: String, protected val weight: Double) {
}

class Cat(Name: String, Weight: Double) : AnimalProtected(Name, Weight)

fun main() {
    val cat = Cat("Kathy", 2.0)
    println("Nama kucing: ${cat.name}")
    //println("Berat kucing: ${cat.weight}")
}