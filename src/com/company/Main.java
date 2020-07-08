package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Member m = new Member();
            m.setMemberName("Steven");
            m.setMemberGender(Gender.M);
            System.out.println(m.getMemberGender().getDescriptionGender());
            m.setMemberName("David");


        Member k = new Member();
            k.setMemberName("Kim");
            k.setMemberGender(Gender.X);


        Payments p = new Payments();
            p.setPaymentOptions(PaymentOptions.BANKTRANSFER);
            System.out.println(m.testPayment());
            LocalDate ld = LocalDate.of(2020,7,6);
            p.myPaymentLastDate(ld);

        Gym gym = new Gym();
            gym.addListMember(m);
            gym.addListMember(k);

        Location l = new Location();
            l.setLocationName("Room 2");

        Facility f = new Facility();
            f.addMaxCapacity("sauna", 5);

        Membership mShip = new Membership();
            mShip.setTypeMembership(TypeMembership.GOLDMEMBERSHIP);
            mShip.displayPrice(mShip.getTypeMembership().toString());
            // de methode hieronder heeft de zelfde uitvoer als de methode hierboven
            mShip.displayTypeMembership(TypeMembership.FITNESSMEMBERSHIP);
            mShip.setMembershipStartDate(ld);
                System.out.println("Your membership starts on " + mShip.getMembershipStartDate());
            mShip.setMembershipEndDate(ld = ld.plusMonths(6));
                System.out.println("Your membership ends on " + mShip.getMembershipEndDate());

        LocalDate timeLogDate = LocalDate.now();
        LocalTime entryTime = LocalTime.of(8,30);
        LocalTime exitTime = LocalTime.of(10,30);
        m.memberTimeLog(entryTime,exitTime,timeLogDate);
        k.memberTimeLog(entryTime,exitTime,timeLogDate);

    }
}
