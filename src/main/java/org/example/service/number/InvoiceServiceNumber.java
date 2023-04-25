package org.example.service.number;

import org.example.entity.Invoice;

import org.example.repository.InvoiceRepositoryInterface;
import org.example.service.InvoiceServiceInterface;
import org.springframework.stereotype.Service;


//@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {
   // nous allons donc creer le service metier qui va permettre de creer une facture
    private static long lastNumber = 0L;

     //plutot que de reinstancier le repositorie(createInvoice) a chaque fois, nous allons creer
    //une propriete de type repository

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    // cette methode ne va rien retourer
    public void createInvoice(Invoice invoice){

        //string.valueof va nous permettre de convertir le long en string
        invoice.setNumber(String.valueOf(++lastNumber));

        //nous allons l'utiliser ici au lieu de l'intancier a chaque fois cette methode sera appeler
        invoiceRepository.create(invoice);
    }



}
