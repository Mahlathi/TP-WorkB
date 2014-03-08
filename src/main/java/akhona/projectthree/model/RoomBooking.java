/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akhona.projectthree.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author davinci
 */
public class RoomBooking {
    private String roomType;
    private String guestId;
    private List<Guest> guests;
    
    private RoomBooking()
    {}
    
    private RoomBooking( Builder builder )
    {
        roomType = builder.roomType;
        guestId = builder.guestId;
        guests = builder.guests;
    }
    
    public static class Builder
    {
        private String roomType;
        private String guestId;
        private List<Guest> guests;
        
        public Builder( String roomType )
        {
            this.roomType = roomType;
        }
        
        public Builder guestId( String value )
        {
            guestId = value;
            return this;
        }
        
        public Builder guests( List<Guest> values )
        {
            guests = values;
            return this;
        }
        
        public RoomBooking build()
        {
            return new RoomBooking(this);
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public String getGuestId() {
        return guestId;
    }

    public List<Guest> getGuests() {
        return guests;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.guestId);
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
        final RoomBooking other = (RoomBooking) obj;
        if (!Objects.equals(this.guestId, other.guestId)) {
            return false;
        }
        return true;
    }
    
    
}
