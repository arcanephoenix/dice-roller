package net.chinmaypai.diceroller2

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var i_Dice : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b_Roll = findViewById<Button>(R.id.bRoll)
        b_Roll.text = "Yeet"
        b_Roll.setOnClickListener {
            rollDice()
        }
        i_Dice = findViewById(R.id.iDice)
    }

    private fun rollDice() {
        val ran = Random.nextInt(6)
        val image = when (ran) {
            0 -> R.drawable.dice_1
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            5 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        i_Dice.setImageResource(image)
    }
}
