package com.adapter.model;

import com.adapter.external.JuspayPayment;

public class JuspayPaymentProviderAdapter implements PaymentProvider{

    private JuspayPayment juspayPayment;

    public JuspayPaymentProviderAdapter(JuspayPayment juspayPayment) {
        this.juspayPayment = juspayPayment;
    }

    @Override
    public void makePayment() {
        juspayPayment.pay();
    }

    @Override
    public void status() {
        this.juspayPayment.status();
    }
}
