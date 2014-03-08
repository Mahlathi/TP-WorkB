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
public final class Catering {
    private int roomNumber;
    private String order;
    
    private Catering()
    {}
    
    private Catering( Builder builder )
    {
        order = builder.order;
        roomNumber = builder.roomNumber;
    }
    
    public static class Builder
    {
        private int roomNumber;
        private String order;  
        
        public Builder( String order )
        {
            this.order = order;
        }
        
        public Builder roomNumber( int value )
        {
            roomNumber = value;
            return this;
        }
        
        public Catering build()
        {
            return new Catering(this);
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getOrder() {
        return order;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.roomNumber;
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
        final Catering other = (Catering) obj;
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        return true;
    }
    
    
}
