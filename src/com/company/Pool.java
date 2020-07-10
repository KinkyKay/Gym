package com.company;

public class Pool extends Facility implements WheelChairAccess {
    public void access(boolean isAccesseble) {
        if (isAccesseble == true) {
            System.out.println("The facility is accessible for Wheelchairusers.");
        } else {
            System.out.println("The facility is not accessible for Wheelchairusers.");
        }
    }


    public void emergencyProtocol() {
        System.out.println("Please follow the directions on the wall");
    }

}
