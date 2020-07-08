package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Payments {
    private boolean paymentStatus;
    private PaymentOptions paymentOptions;
    private LocalDate paymentLastDate;


    public LocalDate getPaymentLastDate() {
        return paymentLastDate;
    }

    public void setPaymentLastDate(LocalDate paymentLastDate) {
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

    public LocalDate myPaymentLastDate() {
        return LocalDate.now();
    }

    public void myPaymentLastDate(LocalDate ldt) {
        paymentLastDate = ldt;
        System.out.println("Last day payed = " + paymentLastDate);
    }
}

