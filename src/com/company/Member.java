package com.company;

import java.sql.SQLOutput;
import java.util.List;

public class Member {
    private Gender memberGender;
    private String memberAddress;
    private String memberHealth;
    private String memberName;
    private int memberAge;
    private Membership membership;
    private boolean memberStatus;


    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }


    public boolean isMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(boolean memberStatus) {
        this.memberStatus = memberStatus;
    }


    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberHealth() {
        return memberHealth;
    }

    public void setMemberHealth(String memberHealth) {
        this.memberHealth = memberHealth;
    }


    public Gender getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(Gender memberGender) {
        this.memberGender = memberGender;
    }

    public boolean testPayment() {
        Payments payments = new Payments();
        if (payments.isPaymentStatus()) {
            System.out.println("Payment done with" + payments.getPaymentOptions() + " on " + payments.getPaymentLastDate());
            return true;
        } else {
            System.out.println("You still need to pay");
            return false;
        }
            }

    public void viewMember(){
        System.out.println(" is a member "+ membership.getMembershipStartDate());
    }
}
