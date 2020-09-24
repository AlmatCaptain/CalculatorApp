package kz.iitu.myapplication

import kotlinx.android.synthetic.main.activity_main.*

class Calculator {

    fun sum(num1: Int, num2: Int): String = (num1 + num2).toString()

    fun minus(num1: Int, num2: Int): String = (num1 - num2).toString()

    fun multiple(num1: Int, num2: Int): String = (num1 * num2).toString()

    fun divide(num1: Int, num2: Int): String {
        if (num2 != 0) {
            if (num1 % num2 == 0)
                return (num1 / num2).toString()
            else
                return String.format("%.2f", (num1.toDouble() / num2.toDouble()))
        } else
            return "Error"

    }


    fun operate(f: Int, s: Int, o: String): String {
        var res: String = ""
        when (o) {
            "+" -> res = sum(f, s)
            "-" -> res = minus(f, s)
            "*" -> res = multiple(f, s)
            "/" -> res = divide(f, s)
        }

        return res
    }

}