package com.train

import java.util.*

fun main(){
    val scanner=Scanner(System.`in`)
    print("Please enter number of tickets:")
    var ticket=scanner.nextInt()
    print("How many round-trip tickets:")
    var round=scanner.nextInt()
    val tic=Ticket1(ticket,round)
    tic.print()
}
class Ticket1(var ticket:Int,var round:Int){
        fun print(){
            println("Total tickets:" + ticket + "\n" +
                    "Round-trip:" + round + "\n" +
                    "Totle:" + (1000 * (ticket - round) + 1800 * round))
        }

    }