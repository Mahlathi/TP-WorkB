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
public final class EventSchedule {
    private String type;
    private String venue;
    private List<Guest> guests;
    
    private EventSchedule()
    {}
    
    private EventSchedule( Builder builder )
    {
        type = builder.type;
        venue = builder.venue;
        guests = builder.guests;
    }
    
    public static class Builder
    {
        private String type;
        private String venue;
        private List<Guest> guests;
        
        public Builder( String venue )
        {
            this.venue = venue;
        }
        
        public Builder type( String value )
        {
            type = value;
            return this;
        }
        
        public Builder guests( List<Guest> values )
        {
            guests = values;
            return this;
        }
        
        public EventSchedule build()
        {
            return new EventSchedule(this);
        }
        
    }

    public String getType() {
        return type;
    }

    public String getVenue() {
        return venue;
    }

    public List<Guest> getGuests() {
        return guests;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.type);
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
        final EventSchedule other = (EventSchedule) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
