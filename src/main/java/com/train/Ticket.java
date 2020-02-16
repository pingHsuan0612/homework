package com.train;

public class Ticket {
    int ticket;
    int round;

    public Ticket(int ticket,int round){
        this.ticket=ticket;
        this.round=round;
    }
    public void print(){
        System.out.println("Total tickets:"+ticket+"\n"+
                             "Round-trip:"+round+"\n"+
                             "Totle:"+((1000*(ticket-round)+(1800*round))));
    }
}
