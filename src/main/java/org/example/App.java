package org.example;

import org.example.controller.InvoiceControllerInterface;
import org.example.service.InvoiceServiceInterface;
import org.example.service.prefix.InvoiceServicePrefix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
//@Configuration
@SpringBootApplication
//@ComponentScan(basePackages = "org.example")
//@PropertySource("classpath:application.properties")
//@EnableAutoConfiguration
public class App
{
    public static void main( String[] args ) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        //ceci nous permet de lancer l'application spring boot
        ApplicationContext context = SpringApplication.run(App.class, args);
        InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();
    }

   /* @Bean
    public InvoiceServiceInterface configureInvoiceService(){
        return new InvoiceServicePrefix();
    }

    */
}
