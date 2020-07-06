package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Member m = new Member();
            m.setMemberName("Steven");
            m.setMemberGender(Gender.M);
            System.out.println(m.getMemberGender().getDescriptionGender());

        Member k = new Member();
            k.setMemberName("Kim");
            k.setMemberGender(Gender.X);

        Payments p = new Payments();
            p.setPaymentOptions(PaymentOptions.BANKTRANSFER);
            System.out.println(m.testPayment());

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

        //if (m.getMembership().getTypeMembership().name().equals(TypeMembership.goldMembership)) {
        //    System.out.println("test");
        //}


        //volgorde voor uitprint


    }
}
