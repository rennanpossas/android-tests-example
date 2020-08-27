package com.rennanpossas.androidtestsexample.basic

//Testable class with 2 class parameters that could be mocked at unit test
class BasicClass(
    val class1: Class1,
    val class2: Class2
    ) {
    fun sum() = class1.prop.toInt() + class2.prop
}