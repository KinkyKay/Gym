package com.company;

import java.util.ArrayList;
import java.util.List;

public class Facility {
    private List<String> facilityList = new ArrayList<>();
    private int maxCapacity;
    private boolean accessible;

    public boolean isAccessible() {
        return accessible;
    }

    public void setAccessible(boolean accessible) {
        this.accessible = accessible;
    }

    public List<String> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<String> facilityList) {
        this.facilityList = facilityList;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addMaxCapacity(String s,int nb) {
        for(int i = 0; i < facilityList.size(); i++) {
            facilityList.set(i,s);
            this.setMaxCapacity(nb);
        }
    }


}
