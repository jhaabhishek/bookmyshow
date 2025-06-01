package com.bookmyshow.bangalore.service;

import com.bookmyshow.bangalore.model.PaymentStrategy;

public class PaymentContext {

	private PaymentStrategy strategy;
    public PaymentContext(PaymentStrategy strategy) { this.strategy = strategy; }
    public void executePayment(double amount) { strategy.pay(amount); }
}
