package model.service;

import model.interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {
    @Override
    public Double paymentFree(Double amount) {
        return 0.0;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return 0.0;
    }
}
