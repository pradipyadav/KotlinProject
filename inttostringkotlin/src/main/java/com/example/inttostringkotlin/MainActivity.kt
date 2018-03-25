package com.example.inttostringkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            var b=editText.text
            var int:Int=Integer.parseInt(b.toString())

            var string:String = numToWords(int)
            Result.setText(string)
        }

    }
}

        object NumberToWordsConverter {
            val units = arrayOf<String>("", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen")
            val tens = arrayOf<String>("", // 0
                    "", // 1
                    "Twenty", // 2
                    "Thirty", // 3
                    "Forty", // 4
                    "Fifty", // 5
                    "Sixty", // 6
                    "Seventy", // 7
                    "Eighty", // 8
                    "Ninety" // 9
            )
            fun convert(n:Int):String {
                if (n < 0)
                {
                    return "Minus " + convert(-n)
                }
                if (n < 20)
                {
                    return units[n]
                }
                if (n < 100)
                {
                    return tens[n / 10] + (if ((n % 10 != 0)) " " else "") + units[n % 10]
                }
                if (n < 1000)
                {
                    return units[n / 100] + " Hundred" + (if ((n % 100 != 0)) " " else "") + convert(n % 100)
                }
                if (n < 100000)
                {
                    return convert(n / 1000) + " Thousand" + (if ((n % 10000 != 0)) " " else "") + convert(n % 1000)
                }
                if (n < 10000000)
                {
                    return convert(n / 100000) + " Lakh" + (if ((n % 100000 != 0)) " " else "") + convert(n % 100000)
                }
                return convert(n / 10000000) + " Crore" + (if ((n % 10000000 != 0)) " " else "") + convert(n % 10000000)
            }
        }

        private fun numToWords(n:Int):String { //optional
            val numtowrd= NumberToWordsConverter // directly implement this
            return numtowrd.convert(n)
        }
        fun main(varargs : Array<String>) {
            val input = Scanner(System.`in`)
            var num: Int = input.nextInt()
            var numInStr :String = numToWords(num)
            println(numInStr)
        }



