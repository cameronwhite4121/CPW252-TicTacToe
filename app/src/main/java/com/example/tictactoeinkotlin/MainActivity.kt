package com.example.tictactoeinkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initializers
        val turnOrder:  TextView = findViewById(R.id.textView)
        var currentPlayer: Char = 'X'
        turnOrder.text = "Player ${currentPlayer}'s turn"

        // Called every VALID button click
        fun changePlayer() {
            currentPlayer = if (currentPlayer == 'X') {
                'O'
            } else {
                'X'
            }
            turnOrder.text = "Player ${currentPlayer}'s turn"
        }

        // Tic tac toe board logic
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            if (button1.text == "") {
                button1.text = currentPlayer.toString()
                changePlayer()
            }
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            if (button2.text == "") {
                button2.text = currentPlayer.toString()
                changePlayer()
            }
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            if (button3.text == "") {
                button3.text = currentPlayer.toString()
                changePlayer()
            }
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            if (button4.text == "") {
                button4.text = currentPlayer.toString()
                changePlayer()
            }
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {
            if (button5.text == "") {
                button5.text = currentPlayer.toString()
                changePlayer()
            }
        }

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            if (button6.text == "") {
                button6.text = currentPlayer.toString()
                changePlayer()
            }
        }

        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            if (button7.text == "") {
                button7.text = currentPlayer.toString()
                changePlayer()
            }
        }

        val button8: Button = findViewById(R.id.button8)
        button8.setOnClickListener {
            if (button8.text == "") {
                button8.text = currentPlayer.toString()
                changePlayer()
            }
        }

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener {
            if (button9.text == "") {
                button9.text = currentPlayer.toString()
                changePlayer()
            }
        }

        // New game button logic
        val newGameBtn:  Button = findViewById(R.id.btnNewGame)
        newGameBtn.text = "New Game"
        newGameBtn.setOnClickListener {
            button1.text = ""
            button2.text = ""
            button3.text = ""
            button4.text = ""
            button5.text = ""
            button6.text = ""
            button7.text = ""
            button8.text = ""
            button9.text = ""
            turnOrder.text = "Player X's turn"
        }
    }
}