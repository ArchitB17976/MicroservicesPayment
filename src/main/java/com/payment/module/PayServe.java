package com.payment.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServe 
{
    @Autowired
    private PayRepo rep;

    // "Create" operations
    public Payment addPayment(Payment payment)
    {
        return rep.save(payment);
    }
}
