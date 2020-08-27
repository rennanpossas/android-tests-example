package com.rennanpossas.androidtestsexample

import com.rennanpossas.androidtestsexample.basic.BasicClass
import com.rennanpossas.androidtestsexample.basic.Class1
import com.rennanpossas.androidtestsexample.basic.Class2
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class BasicClassTest {
    @Test
    fun `sum two values`(){
        val class1 = mockk<Class1>() //Creating mock of Class1
        val class2 = mockk<Class2>() //Creating mock of Class2

        every { class1.prop } returns "5" //Every calls to class1.prop will returns string 5
        every { class2.prop } returns 6 //Every calls to class2.prop will returns integer 6

        val classTest = BasicClass(class1, class2) // Creating BasicClass instance with mocks above

        assertEquals(11, classTest.sum()) // checking the execution of method sum with mocked parameters
    }
}