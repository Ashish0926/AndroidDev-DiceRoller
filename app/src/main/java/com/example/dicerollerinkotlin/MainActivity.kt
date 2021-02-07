package com.example.dicerollerinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {rollDice()
        }
    }

    private fun rollDice() {
        val randInt = (1..6).random()

        Toast.makeText(this, "Dice Rolled",
            Toast.LENGTH_SHORT).show()

//        val rollTxt : TextView = findViewById(R.id.rollText)
//        rollTxt.text = randInt.toString()

        val diceImg : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when(randInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg.setImageResource(drawableResource)
    }

}