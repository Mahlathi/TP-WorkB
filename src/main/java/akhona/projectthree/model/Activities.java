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
public final class Activities {
    
    private int ageLimit;
    private String type;
    private String date;
    private String time;
    private String venue;
    
    private Activities()
    {}
    
    private Activities( Builder builder )
    {
        
        ageLimit = builder.ageLimit;
        type = builder.type;
        date = builder.date;
        time = builder.time;
        venue = builder.venue;
    }
    
    public static class Builder
    {
        
        private int ageLimit;
        private String type;
        private String date;
        private String time;
        private String venue;
        
        public Builder( String type )
        {
            this.type = type;
        }
        
        public Builder ageLimit( int value )
        {
            ageLimit = value;
            return this;
        }
        
        public Builder date( String value )
        {
            date = value;
            return this;
        }
        
        public Builder time( String value )
        {
            time = value;
            return this;
        }
        
        public Builder venue( String value )
        {
            venue = value;
            return this;
        }
        
        public Activities build()
        {
            return new Activities(this);
        }

       
    }

     public int getAgeLimit() {
        return ageLimit;
    }
     
    public String getType() {
        return type;
    }
    
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getVenue() {
        return venue;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.ageLimit;
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
        final Activities other = (Activities) obj;
        if (this.ageLimit != other.ageLimit) {
            return false;
        }
        return true;
    }
    
    
}
