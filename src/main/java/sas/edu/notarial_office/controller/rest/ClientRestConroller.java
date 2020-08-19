package sas.edu.notarial_office.controller.rest;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sas.edu.notarial_office.model.Client;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.servises.client.impls.ClientServicesImpl;
import sas.edu.notarial_office.servises.discount.impls.DiscountServisesImpls;

import java.util.List;

@RequestMapping("/api/client")
@RestController
public class ClientRestConroller {

    @Autowired
    ClientServicesImpl clientServicesImpl;

    @RequestMapping("")
    String getIndex(){
        return "<h1>Index Rest Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello form Client Controller</h1>";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    List<Client> getClientList(){
        return clientServicesImpl.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Client getClient(@PathVariable("id") String id){
        return clientServicesImpl.get(id);
    }


}
