package alves.renan.passingobjects

import java.io.Serializable

class Person(val name: String) : Serializable {

    fun sayHello(): String {
        return "Hello, my name is $name"
    }
}