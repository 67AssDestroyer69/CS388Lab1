package com.example.rothcs388lab1
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var gameOver = false

    println("Welcome to the Porn Game!")
    println("You find yourself in a dimly lit room with a mysterious figure.")
    println("What do you want to do?")
    println("1. Approach the figure")
    println("2. Leave the room")

    while (!gameOver) {
        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                println("You approach the figure and they start to undress slowly.")
                println("What do you do next?")
                println("1. Join them")
                println("2. Watch from a distance")
                val nextChoice = scanner.nextInt()
                when (nextChoice) {
                    1 -> {
                        println("You join them and start making out passionately.")
                        println("The figure leads you to a bed and you both start to explore each other's bodies.")
                        println("You have a wild night of passion together.")
                        gameOver = true
                    }
                    2 -> {
                        println("You decide to watch from a distance, enjoying the show.")
                        println("The figure notices you and smiles, beckoning you to join.")
                        println("You hesitantly approach and they take your hand, leading you to the bed.")
                        println("You spend the night together, exploring each other's desires.")
                        gameOver = true
                    }
                    else -> println("Invalid choice. Please try again.")
                }
            }
            2 -> {
                println("You decide to leave the room, missing out on a potential adventure.")
                gameOver = true
            }
            else -> println("Invalid choice. Please try again.")
        }
    }

    println("Thanks for playing the Porn Game!")
}
