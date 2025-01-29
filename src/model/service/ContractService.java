package model.service;

import model.entities.Contract;
import model.interfaces.OnlinePaymentService;

public class ContractService implements OnlinePaymentService {

    public void processContract(Contract contract,Integer months) {

    }

    @Override
    public Double paymentFree(Double amount) {
        return 0.0;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return 0.0;
    }
}
