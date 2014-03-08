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
public final class Room {
    private int roomNumber;
    private String roomType;
    
    private Room()
    {}
    
    private Room( Builder builder )
    {
        roomNumber = builder.roomNumber;
        roomType = builder.roomType;
    }
    
    public static class Builder
    {
        private int roomNumber;
        private String roomType;
        
        public Builder( String roomType )
        {
            this.roomType = roomType;
        }
        
        public Builder roomNumber( int value )
        {
            roomNumber = value;
            return this;
        }
        
        public Room build()
        {
            return new Room(this);
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.roomNumber;
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
        final Room other = (Room) obj;
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        return true;
    }
    
    
}
