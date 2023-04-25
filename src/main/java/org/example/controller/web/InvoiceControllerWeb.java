package org.example.controller.web;

import org.example.controller.InvoiceControllerInterface;
import org.example.entity.Invoice;
import org.example.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    @Autowired
    private  InvoiceServiceInterface invoiceService;


    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceService;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceService = invoiceServiceInterface;
    }

    public void createInvoice(){

        String custumerName = "Tesla";

        Invoice invoice = new Invoice();
        invoice.setCustumerName(custumerName);

        invoiceService.createInvoice(invoice);
    }
    @RequestMapping("/invoice-home")
    public String displayHome(){
        System.out.println(("la methode display home a ete invoquée"));
        return "index";
    }
}
