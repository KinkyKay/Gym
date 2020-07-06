package com.company;

import java.util.Date;

public class Payments {
    private boolean paymentStatus;
    private PaymentOptions paymentOptions;
    private Date paymentLastDate;



    public Date getPaymentLastDate() {
        return paymentLastDate;
    }

    public void setPaymentLastDate(Date paymentLastDate) {
        this.paymentLastDate = paymentLastDate;
    }

    public PaymentOptions getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(PaymentOptions paymentOptions) {
        this.paymentOptions = paymentOptions;
    }


    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


}
