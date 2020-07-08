package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    LocalTime mondayOpen;
    LocalTime mondayClosed;
    LocalTime tuesdayOpen;
    LocalTime tuesdayClosed;
    LocalTime wednesdayOpen;
    LocalTime wednesdayClosed;
    LocalTime thursdayOpen;
    LocalTime thursdayClosed;
    LocalTime fridayOpen;
    LocalTime fridayClosed;
    LocalTime saterdayOpen;
    LocalTime saterdayClosed;
    LocalTime sundayOpen;
    LocalTime sundayClosed;


    public LocalTime getMondayOpen() {
        return mondayOpen;
    }

    public void setMondayOpen(LocalTime mondayOpen) {
        this.mondayOpen = mondayOpen;
    }

    public LocalTime getMondayClosed() {
        return mondayClosed;
    }

    public void setMondayClosed(LocalTime mondayClosed) {
        this.mondayClosed = mondayClosed;
    }

    public LocalTime getTuesdayOpen() {
        return tuesdayOpen;
    }

    public void setTuesdayOpen(LocalTime tuesdayOpen) {
        this.tuesdayOpen = tuesdayOpen;
    }

    public LocalTime getTuesdayClosed() {
        return tuesdayClosed;
    }

    public void setTuesdayClosed(LocalTime tuesdayClosed) {
        this.tuesdayClosed = tuesdayClosed;
    }

    public LocalTime getWednesdayOpen() {
        return wednesdayOpen;
    }

    public void setWednesdayOpen(LocalTime wednesdayOpen) {
        this.wednesdayOpen = wednesdayOpen;
    }

    public LocalTime getWednesdayClosed() {
        return wednesdayClosed;
    }

    public void setWednesdayClosed(LocalTime wednesdayClosed) {
        this.wednesdayClosed = wednesdayClosed;
    }

    public LocalTime getThursdayOpen() {
        return thursdayOpen;
    }

    public void setThursdayOpen(LocalTime thursdayOpen) {
        this.thursdayOpen = thursdayOpen;
    }

    public LocalTime getThursdayClosed() {
        return thursdayClosed;
    }

    public void setThursdayClosed(LocalTime thursdayClosed) {
        this.thursdayClosed = thursdayClosed;
    }

    public LocalTime getFridayOpen() {
        return fridayOpen;
    }

    public void setFridayOpen(LocalTime fridayOpen) {
        this.fridayOpen = fridayOpen;
    }

    public LocalTime getFridayClosed() {
        return fridayClosed;
    }

    public void setFridayClosed(LocalTime fridayClosed) {
        this.fridayClosed = fridayClosed;
    }

    public LocalTime getSaterdayOpen() {
        return saterdayOpen;
    }

    public void setSaterdayOpen(LocalTime saterdayOpen) {
        this.saterdayOpen = saterdayOpen;
    }

    public LocalTime getSaterdayClosed() {
        return saterdayClosed;
    }

    public void setSaterdayClosed(LocalTime saterdayClosed) {
        this.saterdayClosed = saterdayClosed;
    }

    public LocalTime getSundayOpen() {
        return sundayOpen;
    }

    public void setSundayOpen(LocalTime sundayOpen) {
        this.sundayOpen = sundayOpen;
    }

    public LocalTime getSundayClosed() {
        return sundayClosed;
    }

    public void setSundayClosed(LocalTime sundayClosed) {
        this.sundayClosed = sundayClosed;
    }

    public boolean isOpen(LocalTime lt, LocalDate ld) {
        switch (ld.getDayOfWeek()) {
            case MONDAY:
                if (mondayOpen.isBefore(lt) && mondayClosed.isAfter(lt)) {
                    return true;
                } else {
                    return false;
                }
            case TUESDAY:
                if (tuesdayOpen.isBefore(lt) && thursdayClosed.isAfter(lt)) {
                    return true;
                } else {
                    return false;
                }
            case WEDNESDAY:
                if (wednesdayOpen.isBefore(lt) && wednesdayClosed.isAfter(lt)) {
                    return true;
                } else {
                    return false;
                }
            case THURSDAY:
                if (thursdayOpen.isBefore(lt) && thursdayClosed.isAfter(lt)) {
                    return true;
                } else {
                    return false;
                }
            case FRIDAY:
                if (fridayOpen.isBefore(lt) && fridayClosed.isAfter(lt)) {
                    return true;
                } else {
                    return false;
                }
            case SATURDAY:
                if (saterdayOpen.isBefore(lt) && saterdayClosed.isAfter(lt)) {
                    return true;
                } else {
                    return false;
                }
            case SUNDAY:
                if (sundayOpen.isBefore(lt) && sundayClosed.isAfter(lt)) {
                    return true;
                } else {
                    return false;
                }
            default:
                System.out.println("Please select the day you want to go to the gym");
        }
    }
}
