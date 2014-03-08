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
public final class StaffSchedule {
    private List<Staff> list;
    private String time;
    private String date;
    
    private StaffSchedule()
    {}
    
    private StaffSchedule( Builder builder )
    {
        list = builder.list;
        time = builder.time;
        date = builder.date;
    }
    
    public static class Builder
    {
        private List<Staff> list;
        private String time;
        private String date;
        
        public Builder( String date )
        {
            this.date = date;
        }
        
        public Builder list( List<Staff> value)
        {
            list = value;
            return this;
        }
        
        public Builder time( String value )
        {
            time = value;
            return this;
        }
        
        public StaffSchedule build()
        {
            return new StaffSchedule(this);
        }
    }

    public List<Staff> getList() {
        return list;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.date);
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
        final StaffSchedule other = (StaffSchedule) obj;
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
}
