package model.interfaces;

public interface OnlinePaymentService {

    public Double paymentFree (Double amount);
    public Double interest (Double amount, Integer months);
}
