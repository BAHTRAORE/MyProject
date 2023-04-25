package org.example.repository.database;

import org.example.entity.Invoice;
import org.example.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    //creer une liste de facture
    // cette methode va recevoire la facture
    //l'idee est de stockee cette facture en memoire
    public void create(Invoice invoice){
       /*
       * cest a ce niveau nous allons coonecter la base de donnees
       * */

        System.out.println("Data invoice added with number " +invoice.getNumber() + " for " + invoice.getCustumerName());

    }
}
