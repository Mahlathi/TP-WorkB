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

public final class Laundry {
    private int guestId;
    private String items;
    
    private Laundry()
    {}
    
    private Laundry( Builder builder )
    {
        items = builder.items;
        guestId = builder.guestId;
    }
    
    public static class Builder
    {
        private int guestId;
        private String items; 
        
        public Builder( String items )
        {
            this.items = items;
        }
        
        public Builder guestId( int value )
        {
            guestId = value;
            return this;
        }
        
        public Laundry build()
        {
            return new Laundry(this);
        }
    }

    public int getGuestId() {
        return guestId;
    }

    public String getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.guestId;
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
        final Laundry other = (Laundry) obj;
        if (this.guestId != other.guestId) {
            return false;
        }
        return true;
    }
}
