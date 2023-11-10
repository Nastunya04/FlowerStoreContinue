package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.demo.flowers.payment.CreditCardPaymentStrategy;
import com.example.demo.flowers.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Test;

public class PaymentTest {

    @Test
    public void testPay1() {
        CreditCardPaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
        int result = creditCardPayment.pay(100);
        assertEquals(0, result, "Credit card payment should return 0");
    }

    @Test
    public void testPay2() {
        PayPalPaymentStrategy payPalPayment = new PayPalPaymentStrategy();
        int result = payPalPayment.pay(100);
        assertEquals(1, result, "PayPal payment should return 1");
    }
}
