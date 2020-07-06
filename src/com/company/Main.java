package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Member m = new Member();
            m.setMemberName("Steven");
            m.setMemberGender(Gender.M);

        Payments p = new Payments();
            p.setPaymentOptions(PaymentOptions.banktransfer);

            System.out.println(m.testPayment());

        Gym gym = new Gym();
            gym.addListMember(m);

        Location l = new Location();
            l.setLocationName("Room 2");

        Facility f = new Facility();
            f.addMaxCapacity("sauna", 5);


        //if (m.getMembership().getTypeMembership().name().equals(TypeMembership.goldMembership)) {
        //    System.out.println("test");
        //}

    }
}
