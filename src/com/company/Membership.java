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


    public void displayPrice(String s) {
        switch (s) {
            case "GOLDMEMBERSHIP":
                System.out.println("You've chosen the Goldmembership. This membership costs 100 €.");
                break;
            case "GROUPMEMBERSHIP":
                System.out.println("You've chosen the Groupmembership. This membership costs 50 €");
                break;
            case "FITNESSMEMBERSHIP":
                System.out.println("You've chosen the Fitnessmembership. This membership costs 75 €");
                break;
            case "WEEKENDMEMBERSHIP":
                System.out.println("You've chosen the Weekendmembership. This membership costs 25 €");
            default:
                System.out.println("Please select your type of membership");
        }
    }

    public void displayTypeMembership(TypeMembership typeMembership) {
        switch (typeMembership) {
            case GOLDMEMBERSHIP:
                System.out.println("You've chosen the Goldmembership. This membership costs 100 €.");
                break;
            case FITNESSMEMBERSHIP:
                System.out.println("You've chosen the Fitnessmembership. This membership costs 75€.");
                break;
            case GROUPMEMBERSHIP:
                System.out.println("You've chosen the Groupmembership. This membership costs costs 50 €.");
                break;
            case WEEKENDMEMBERSHIP:
                System.out.println("You've chosen the Weekendmembership. This membership costs 25 €.");
                break;
            default:
                System.out.println("Please select your type of membership");

        }
    }

}
