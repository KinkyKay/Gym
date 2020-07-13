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

        Pool p = new Pool();
        p.access(true);
        p.emergencyProtocol();

        Sauna sauna = new Sauna();
        sauna.changeTemp(false);
        sauna.degrees(70);

        LocalDate dateSchedule = LocalDate.now();

        Schedule s = initializeWeekSchedule(LocalTime.of(9,0), LocalTime.of(22,0), LocalTime.of(9,30), LocalTime.of(23,0));

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
        m.setMemberGender(Gender.M);
        m.setMemberAddress("Kerkstraat 16 , 9420 Erembodegem");
        m.setMemberAge(40);
        m.setMemberHealth("FIT");

        System.out.println(m.getMemberGender().getDescriptionGender());
        System.out.println(m.getMemberName());
        System.out.println(m.getMemberGender());
        System.out.println(m.getMemberAddress());
        System.out.println(m.getMemberAge());
        System.out.println(m.getMemberHealth());
        System.out.println(m.isMemberStatus());


        Member k = new Member();
        k.setMemberName("Kim");
        k.setMemberGender(Gender.X);
        k.setMemberAge(37);
        k.setMemberAddress("Provincieweg 248 , 9550 Herzele");
        k.setMemberHealth("No Condition");

        System.out.println(k.getMemberGender().getDescriptionGender());
        System.out.println(k.getMemberName());
        System.out.println(k.getMemberGender());
        System.out.println(k.getMemberAddress());
        System.out.println(k.getMemberAge());
        System.out.println(k.getMemberHealth());
        System.out.println(k.isMemberStatus());

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

    public static Schedule initializeWeekSchedule(LocalTime open, LocalTime close, LocalTime weekendOpen, LocalTime weekendClosed){
        Schedule s = new Schedule();
        s.setMondayOpen(open);//LocalTime.of(9,0));
        s.setMondayClosed(close);
        s.setTuesdayOpen(open);
        s.setTuesdayClosed(close);
        s.setWednesdayOpen(open);
        s.setWednesdayClosed(close);
        s.setThursdayOpen(open);
        s.setThursdayClosed(close);
        s.setFridayOpen(open);
        s.setFridayClosed(close);
        s.setSaterdayOpen(weekendOpen);
        s.setSaterdayClosed(weekendClosed);
        s.setSundayOpen(weekendOpen);
        s.setSundayClosed(weekendClosed);
        return s;
    }



}
