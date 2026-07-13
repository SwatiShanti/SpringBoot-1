package com.swati.demo.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    //field injection
    //@AutoWired
//    PaymentService paymentService;

    //Constructor injection
    PaymentService paymentService;
    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //Setter Injection
    //@Autowired

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.payment();
        System.out.println("Order placed");
    }
}
