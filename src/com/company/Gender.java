package com.company;

public enum Gender {
    M ("Sir"),F("Mrs"),X("Dear");
    Gender(String descriptionGender) {
        this.descriptionGender = descriptionGender;
    }

    private String descriptionGender;

    public String getDescriptionGender() {
        return descriptionGender;
    }

    public void setDescriptionGender(String descriptionGender) {
        this.descriptionGender = descriptionGender;
    }


}
