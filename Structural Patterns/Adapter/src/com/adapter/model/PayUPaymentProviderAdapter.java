package com.adapter.model;

import com.adapter.external.PayUPayment;

public class PayUPaymentProviderAdapter implements PaymentProvider {

    private PayUPayment payUPayment;

    public PayUPaymentProviderAdapter(PayUPayment payUPayment) {
        this.payUPayment = payUPayment;
    }

    @Override
    public void makePayment() {
        payUPayment.pay();
    }

    @Override
    public void status() {
        payUPayment.status();
    }
}
