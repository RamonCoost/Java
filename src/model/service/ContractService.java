package model.service;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.OnlinePaymentService;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }


    public void processContract(Contract contract, int months) {

        contract.getInstallments().add(new Installment(LocalDate.of(2018,7,25),26.04));
        contract.getInstallments().add(new Installment(LocalDate.of(2018,8,25),28.08));
    }

}
