package com.example.timberdemowithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var button:Button
    private lateinit var num1:EditText
    private lateinit var num2:EditText
    private lateinit var answer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        num1 = findViewById(R.id.first_number)
        num2 = findViewById(R.id.second_number)
        answer = findViewById(R.id.answer)

        button.setOnClickListener {
            val first_number = num1.text.toString().trim { it <= ' ' }.toInt()
            val second_number = num2.text.toString().trim { it <= ' ' }.toInt()
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty()) {
                num1.error = "Cannot be empty!!"
            } else {
                val sum = first_number + second_number
                answer.text = sum.toString()
                Timber.d(answer.text.toString())
            }
        }

    }
}