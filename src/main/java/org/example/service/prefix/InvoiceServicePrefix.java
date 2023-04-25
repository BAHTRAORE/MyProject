package org.example.service.prefix;

import org.example.entity.Invoice;

import org.example.repository.InvoiceRepositoryInterface;
import org.example.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {



    // nous allons donc creer le service metier qui va permettre de creer une facture

    @Value("${invoice.lastNumber}")
    private long lastNumber;

    @Value("${invoice.prefix}")
    private String prefix;


    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;


     //plutot que de reinstancier le repositorie(createInvoice) a chaque fois, nous allons creer


    //une propriete de type repository


    // cette methode ne va rien retourer
    public void createInvoice(Invoice invoice){

        //string.valueof va nous permettre de convertir le long en string
       // invoice.setNumber(String.valueOf(prefix+(++lastNumber)));
        invoice.setNumber(String.valueOf(prefix +(lastNumber)));

        //nous allons l'utiliser ici au lieu de l'intancier a chaque fois cette methode sera appeler
        invoiceRepository.create(invoice);
    }



}
