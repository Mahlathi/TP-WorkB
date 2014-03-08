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
public final class Guest {
    private int guestId;
    private int roomNumber;
    
    private Guest()
    {}
    
    private Guest( Builder builder )
    {
        guestId = builder.guestId;
        roomNumber = builder.roomNumber;
    }
    
    public static class Builder
    {
        private int guestId;
        private int roomNumber;
        
        public Builder( int roomNumber )
        {
            this.roomNumber = roomNumber;
        }
        
        public Builder guestId( int value )
        {
            guestId = value;
            return this;
        }
        
        public Guest build()
        {
            return new Guest(this);
        }
    }

    public int getGuestId() {
        return guestId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.guestId;
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
        final Guest other = (Guest) obj;
        if (this.guestId != other.guestId) {
            return false;
        }
        return true;
    }
    
    
}
