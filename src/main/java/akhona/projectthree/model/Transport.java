/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectthree.model;

import java.util.List;

/**
 *
 * @author davinci
 */
public final class Transport {
    private int guestId;
    private List<Staff> drivers;
    
    private Transport()
    {}
    
    private Transport( Builder builder )
    {
        guestId = builder.guestId;
        drivers = builder.drivers;
    }
    
    public static class Builder
    {
        private int guestId;
        private List<Staff> drivers;
        
        public Builder( int guestId )
        {
            this.guestId = guestId;
        }
        
        public Builder drivers( List<Staff> values )
        {
            drivers = values;
            return this;
        }
        
        public Transport build()
        {
            return new Transport(this);
        }
    }

    public int getGuestId() {
        return guestId;
    }

    public List<Staff> getDrivers() {
        return drivers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.guestId;
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
        final Transport other = (Transport) obj;
        if (this.guestId != other.guestId) {
            return false;
        }
        return true;
    }
    
    
}
