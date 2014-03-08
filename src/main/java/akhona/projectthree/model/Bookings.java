/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectthree.model;

import java.util.Objects;

/**
 *
 * @author davinci
 */
public final class Bookings {
    private String guestId;
    private String guestName;
    
    
    private Bookings()
    {}
    
    private Bookings( Builder builder )
    {
        guestId = builder.guestId;
        guestName = builder.guestName;
    }
    
    public static class Builder
    {
        private String guestId;
        private String guestName;
        
        public Builder( String guestName )
        {
            this.guestName = guestName;
        }
        
        public Builder guestId( String value )
        {
            guestId = value;
            return this;
        }
        
        public Bookings build()
        {
            return new Bookings(this);
        }
    }

    public String getGuestId() {
        return guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.guestId);
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
        final Bookings other = (Bookings) obj;
        if (!Objects.equals(this.guestId, other.guestId)) {
            return false;
        }
        return true;
    }
    
    
}
