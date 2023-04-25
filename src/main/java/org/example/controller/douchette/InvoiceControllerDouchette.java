package org.example.controller.douchette;

import org.example.controller.InvoiceControllerInterface;
import org.example.entity.Invoice;
import org.example.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {
    @Override
    public void createInvoice() {
        System.out.println("usage of scanner");
        Invoice invoice = new Invoice();
        invoice.setCustumerName("virgin galactic");
        invoiceServiceInterface.createInvoice(invoice);

    }

    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }
}
