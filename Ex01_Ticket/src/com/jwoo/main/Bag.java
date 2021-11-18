package com.jwoo.main;

public class Bag {

    private Invitation invitation;
    private Long amount;
    private Ticket ticket;

    public boolean hasInvitation() {

        return invitation != null;
    }
    public boolean hasTicket() {

        return invitation != null;
    }

    public void setTicket(Ticket ticket) {

        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {

        this.amount -= amount;
    }

    public void plusAmount(Long amount) {

        this.amount += amount;
    }

    public Bag(Long amount) {
        this(null,amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }
}
