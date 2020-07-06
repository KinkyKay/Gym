package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gym {
    private Boolean open;
    private Date openingHours;
    private List<Member> memberList = new ArrayList<>();
    private Payments payments;
    private Membership membership;
    private List<Location> locationList = new ArrayList<>();


    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }


    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Date getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(Date openingHours) {
        this.openingHours = openingHours;
    }

    public void addListMember(Member m) {
        this.memberList.add(m);
        System.out.println("member " +m.getMemberName().toString());
        for(int i = 0; i < memberList.size(); i++) {
            System.out.println(memberList.get(i).getMemberName());
        }
    }

    public void addListLocation(Location loc) {
        this.locationList.add(loc);
        System.out.println("location " + toString());
        for(int i = 0; i < locationList.size(); i++) {
            if(loc.isLocationAccess() && loc.getFacility().isAccessible());{
                System.out.println(locationList.get(i).getLocationName());
            }
        }
    }

}
