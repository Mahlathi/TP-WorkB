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
public final class EventBooking {
    private String event;
    private String date;
    private List<Guest> guests;
    
    private EventBooking()
    {}
    
    private EventBooking( Builder builder )
    {
        event = builder.event;
        date = builder.date;
        guests = builder.guests;
    }
    
    public static class Builder
    {
        private String event;
        private String date;
        private List<Guest> guests;
    
        public Builder( String event )
        {
            this.event = event;
        }
        
        public Builder date( String value )
        {
            date = value;
            return this;
        }
        
        public Builder guests( List<Guest> values )
        {
            guests = values;
            return this;
        }
        
        public EventBooking build()
        {
            return new EventBooking(this);
        }
    }

    public String getEvent() {
        return event;
    }

    public String getDate() {
        return date;
    }

    public List<Guest> getGuests() {
        return guests;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.date);
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
        final EventBooking other = (EventBooking) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
}
