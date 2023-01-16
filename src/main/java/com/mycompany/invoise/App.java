package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceControllerMichel;
import com.mycompany.invoise.repository.InvoiceRepository;
import com.mycompany.invoise.repository.InvoiceRepositoryMichel;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Dans quelle configuration êtes-vous ?");
        Scanner sc=new Scanner (System.in);
        int configuration=sc.nextInt();
        if (configuration==1) {
            InvoiceController invoiceController=new InvoiceController();
            InvoiceService invoiceService=new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepository invoiceRepository=new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();

        }
        else if(configuration==2){
            InvoiceControllerMichel invoiceController = new InvoiceControllerMichel();
            InvoiceServiceMichel invoiceService=new InvoiceServiceMichel();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepositoryMichel invoiceRepository = new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice() ;
        }
    }
}
