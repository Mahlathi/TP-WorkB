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
public class Schedule {
    private String time;
    private String date;
    
    private Schedule()
    {}
    
    private Schedule( Builder builder )
    {
        time = builder.time;
        date = builder.date;
    }
    
    public static class Builder
    {
        private String time;
        private String date;
        
        public Builder( String time )
        {
            this.time = time;
        }
        
        public Builder date( String value )
        {
            date = value;
            return this;
        }
        
        public Schedule build()
        {
            return new Schedule(this);
        }
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.date);
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
        final Schedule other = (Schedule) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
}
