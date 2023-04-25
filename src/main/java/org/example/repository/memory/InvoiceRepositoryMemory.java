package org.example.repository.memory;

import org.example.entity.Invoice;
import org.example.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    //creer une liste de facture
    private static List<Invoice> invoices = new ArrayList<>();



    // cette methode va recevoire la facture
    //l'idee est de stockee cette facture en memoire
    public void create(Invoice invoice){
        invoices.add(invoice);

        System.out.println("invoice added with number " +invoice.getNumber() + " for " + invoice.getCustumerName());
    }
}
