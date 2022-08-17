package com.payment.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PayController 
{
    @Autowired
    private PayServe serve;

    // "Create" operations
    @PostMapping("/makePay")
    public Payment postPayment(@RequestBody Payment payment)
    {
        return serve.addPayment(payment);
    }
}
