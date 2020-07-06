package com.company;

import java.util.Date;

public class Membership {
    private Date membershipStartDate;
    private Date membershipEndDate;
    private double membershipPrice;
    private TypeMembership typeMembership;

    public TypeMembership getTypeMembership() {
        return typeMembership;
    }

    public void setTypeMembership(TypeMembership typeMembership) {
        this.typeMembership = typeMembership;
    }


    public Date getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(Date membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public Date getMembershipEndDate() {
        return membershipEndDate;
    }

    public void setMembershipEndDate(Date membershipEndDate) {
        this.membershipEndDate = membershipEndDate;
    }

    public double getMembershipPrice() {
        return membershipPrice;
    }

    public void setMembershipPrice(double membershipPrice) {
        this.membershipPrice = membershipPrice;
    }


}
