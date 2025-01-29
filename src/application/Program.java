package application;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the contract data");
        System.out.print("Number: ");
        int numberContract = sc.nextInt();
        System.out.print("Date: ");
        LocalDate dateContract = LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Value: ");
        double totalValueContract = sc.nextDouble();

        Contract contract = new Contract(numberContract, dateContract, totalValueContract);

        System.out.print("Enter the number of installment: ");
        int numberInstallment = sc.nextInt();

        ContractService contractService = new ContractService(null);

        contractService.processContract(contract, numberInstallment);

        System.out.println("PARCELAS:");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
