package com.company;

public class Location {
    private String locationName;
    private int maxNumberOfPerson;
    private boolean locationAccess;
    private Facility facility;


    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getMaxNumberOfPerson() {
        return maxNumberOfPerson;
    }

    public void setMaxNumberOfPerson(int maxNumberOfPerson) {
        this.maxNumberOfPerson = maxNumberOfPerson;
    }

    public boolean isLocationAccess() {
        return locationAccess;
    }

    public void setLocationAccess(boolean locationAccess) {
        this.locationAccess = locationAccess;
    }


}
