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
        // Checks for button presses and changes displays
        // depending on what is pressed.
        gameLogic()
    }
    private fun gameLogic() {

        // Initialize buttons
        val turnOrderTextView:  TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)

        var gameIsDraw = false
        var gameOver = false
        var movesMade = 0
        // Returns a bool if the game is over,
        // called whenever a move is made.
        fun isGameOver() : Boolean {
            // Would ideally use a 2-D array + for loops to check for winner
            if(button1.text != "" && button1.text == button2.text && button2.text == button3.text) { //Row 1
                gameOver = true
                return true
            }
            else if(button4.text != "" && button4.text == button5.text && button5.text == button6.text) { // Row 2
                gameOver = true
                return true
            }
            else if(button7.text != "" && button7.text == button8.text && button8.text == button9.text) { // Row 3
                gameOver = true
                return true            }
            else if(button1.text != "" && button1.text == button4.text && button4.text == button7.text) { // Column 1
                gameOver = true
                return true            }
            else if(button2.text != "" && button2.text == button5.text && button5.text == button8.text) { // Column 2
                gameOver = true
                return true            }
            else if(button3.text != "" && button3.text == button6.text && button6.text == button9.text) { // Column 3
                gameOver = true
                return true            }
            else if(button1.text != "" && button1.text == button5.text && button5.text == button9.text) { // First diagonal
                gameOver = true
                return true            }
            else if(button3.text != "" && button3.text == button5.text && button5.text == button7.text) { // Second diagonal
                gameOver = true
                return true            }
            // Max moves have been made and there is no winner
            if (movesMade == 9) {
                turnOrderTextView.text = "Draw game!"
                gameIsDraw = true
                gameOver = true
                return true
            }
            return false
        }

        var currentPlayer = 'X'
        // Updates textView
        fun updateTurnOrder() {
            turnOrderTextView.text = "Player $currentPlayer's turn"
        }

        // This is called when game comes to an end
        fun displayWinningPlayer() {
            if (!gameIsDraw) {
                turnOrderTextView.text = "Player $currentPlayer wins!"
            }
        }

        // Called by every VALID button click
        fun changePlayer() {
            currentPlayer = if (currentPlayer == 'X') {
                'O'
            } else {
                'X'
            }
            updateTurnOrder()
        }

        // Initial update
        updateTurnOrder()

        // Button listeners will check update each empty button
        // then check if the game has ended. If the game hasn't
        // ended, the current player will change.
        button1.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button1.text == "" && !gameOver) {
                button1.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        button2.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button2.text == "" && !gameOver) {
                button2.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        button3.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button3.text == "" && !gameOver) {
                button3.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        button4.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button4.text == "" && !gameOver) {
                button4.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        button5.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button5.text == "" && !gameOver) {
                button5.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        button6.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button6.text == "" && !gameOver) {
                button6.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        button7.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button7.text == "" && !gameOver) {
                button7.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        button8.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button8.text == "" && !gameOver) {
                button8.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        button9.setOnClickListener {
            // Some squares can be empty when the game is over
            if (button9.text == "" && !gameOver) {
                button9.text = currentPlayer.toString()
                movesMade++
                // After turn is over, check if the game has a winner
                if (isGameOver()) {
                    if (!gameIsDraw) {
                        displayWinningPlayer()
                    }
                }
                else {
                    changePlayer()
                }
            }
        }

        val newGameBtn:  Button = findViewById(R.id.btnNewGame)
        newGameBtn.text = "New Game"
        // Clears all buttons and sets turn order to player X
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
            currentPlayer = 'X'
            gameOver = false
            gameIsDraw = false
            movesMade = 0
            updateTurnOrder()
        }
    }
}