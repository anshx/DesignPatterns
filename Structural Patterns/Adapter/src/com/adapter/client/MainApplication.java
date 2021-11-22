package com.adapter.client;

import com.adapter.external.JuspayPayment;
import com.adapter.model.JuspayPaymentProviderAdapter;
import com.adapter.model.PaymentProvider;

public class MainApplication {

    public static void main(String[] args) {

        PaymentProvider provider = new JuspayPaymentProviderAdapter(new JuspayPayment());
        provider.makePayment();
        provider.status();

    }

}
