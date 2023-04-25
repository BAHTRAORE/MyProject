package org.example.controller.keyboard;

import org.example.controller.InvoiceControllerInterface;
import org.example.entity.Invoice;

import org.example.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {
    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    private InvoiceServiceInterface invoiceServiceInterface;
    public void createInvoice(){
        System.out.println( "quelle est le nom de ton client?" );
        Scanner sc = new Scanner(System.in);
        String custumerName = sc.nextLine();

        Invoice invoice = new Invoice();
        invoice.setCustumerName(custumerName);

        invoiceServiceInterface.createInvoice(invoice);
    }

}
