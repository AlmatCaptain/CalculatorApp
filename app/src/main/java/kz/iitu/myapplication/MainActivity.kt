package kz.iitu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }


    private fun initUI() {

        var firstNum: String = ""
        var secondNum: String = ""
        var operation: String = ""

        zero.setOnClickListener {
            appendText("0")
        }
        one.setOnClickListener { appendText("1") }
        two.setOnClickListener { appendText("2") }
        three.setOnClickListener { appendText("3") }
        four.setOnClickListener { appendText("4") }
        five.setOnClickListener { appendText("5") }
        six.setOnClickListener { appendText("6") }
        seven.setOnClickListener { appendText("7") }
        eight.setOnClickListener { appendText("8") }
        nine.setOnClickListener { appendText("9") }

        sum.setOnClickListener {
            firstNum = text.text.toString()
            operation = "+"
            text.setText("")
        }


        minus.setOnClickListener {
            firstNum = text.text.toString()
            operation = "-"
            text.setText("")
        }

        multiple.setOnClickListener {
            firstNum = text.text.toString()
            operation = "*"
            text.setText("")
        }

        divide.setOnClickListener {
            firstNum = text.text.toString()
            operation = "/"
            text.setText("")
        }

        del.setOnClickListener {
            firstNum = ""
            secondNum = ""
            operation = ""
            text.setText("")
        }

        equal.setOnClickListener {
            secondNum = text.text.toString()

            val calculator = Calculator()
            val result = calculator.operate(Integer.parseInt(firstNum), Integer.parseInt(secondNum), operation)

            text.setText(result)
        }
    }

    private fun appendText(str: String) {
        text.append(str)
    }

}


