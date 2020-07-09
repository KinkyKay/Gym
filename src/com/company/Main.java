package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        initializeMember();

        Location l = new Location();
            l.setLocationName("Room 2");

        Facility f = new Facility();
            f.addMaxCapacity("sauna", 5);

        LocalDate dateSchedule = LocalDate.now();

        Schedule s = new Schedule();
        s.setMondayOpen(LocalTime.of(9,0));
        s.setMondayClosed(LocalTime.of(23,0));
        s.setThursdayOpen(LocalTime.of(9,0));
        s.setThursdayClosed(LocalTime.of(23,0));
        System.out.println(s.isOpen(LocalTime.of(8,30), LocalDate.now()));
        boolean OpenClosed = s.isOpen(LocalTime.of(8,30),LocalDate.of(2020, 7, 6));

        if(OpenClosed = true) {
            System.out.println("The facility is open.");
        } else {
            System.out.println("The facility is closed");
        }


    }

    public static void  initializeMember() {
        Member m = new Member();
        m.setMemberName("Steven");
        m.setMemberName("David");
        m.setMemberGender(Gender.M);
        System.out.println(m.getMemberGender().getDescriptionGender());

        Member k = new Member();
        k.setMemberName("Kim");
        k.setMemberGender(Gender.X);
        System.out.println(k.getMemberGender().getDescriptionGender());

        LocalTime entryTime = LocalTime.of(8,30);
        LocalTime exitTime = LocalTime.of(10,30);
        LocalDate dateSchedule = LocalDate.now();
        m.memberTimeLog(entryTime,exitTime,dateSchedule);
        k.memberTimeLog(entryTime,exitTime,dateSchedule);

        Gym gym = new Gym();
        gym.addListMember(m);
        gym.addListMember(k);


        Payments p = new Payments();
        p.setPaymentOptions(PaymentOptions.BANKTRANSFER);
        System.out.println(m.testPayment());
        LocalDate ld = LocalDate.of(2020,7,6);
        p.myPaymentLastDate(ld);


        Membership mShip = new Membership();
        mShip.setTypeMembership(TypeMembership.GOLDMEMBERSHIP);
        mShip.displayPrice(mShip.getTypeMembership().toString());
        // de methode hieronder heeft de zelfde uitvoer als de methode hierboven
        mShip.displayTypeMembership(TypeMembership.FITNESSMEMBERSHIP);
        mShip.setMembershipStartDate(ld);
        System.out.println("Your membership starts on " + mShip.getMembershipStartDate());
        mShip.setMembershipEndDate(ld = ld.plusMonths(6));
        System.out.println("Your membership ends on " + mShip.getMembershipEndDate());

    }
}
