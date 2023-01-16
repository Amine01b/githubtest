package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;



public class InvoiceRepositoryMichel implements InvoiceRepositoryInterface {

    public  void  create(Invoice invoice){

        System.out.println("invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());

       /* PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE(NUMBER,CUSTOMERNAME) VALUES (?,?)");

        pstmt.executeUpdate();

       */


        /*
        invoices.add(invoice);
        System.out.println("invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());
        */
    }
}
