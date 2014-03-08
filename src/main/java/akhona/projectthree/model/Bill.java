/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectthree.model;

/**
 *
 * @author davinci
 */
public final class Bill {
    private int guestId;
    private double amount;
 
    private Bill()
    {}
    
    private Bill( Builder builder )
    {
        guestId = builder.guestId;
        amount = builder.amount;
    }
    
    public static class Builder
    {
        private int guestId;
        private double amount;
        
        public Builder( double amount )
        {
            this.amount = amount;
        }
        
        public Builder guestId( int value )
        {
            guestId = value;
            return this;
        }
        
        public Bill build()
        {
            return new Bill(this); 
        }
    }

    public int getGuestId() {
        return guestId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.guestId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bill other = (Bill) obj;
        if (this.guestId != other.guestId) {
            return false;
        }
        return true;
    }
    
    
}
