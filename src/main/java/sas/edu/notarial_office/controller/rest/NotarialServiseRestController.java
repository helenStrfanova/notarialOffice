package sas.edu.notarial_office.controller.rest;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.model.NotarialService;
import sas.edu.notarial_office.servises.discount.impls.DiscountServisesImpls;
import sas.edu.notarial_office.servises.notarialService.impls.NotarialServiceServicesImpl;

import java.util.List;

@RequestMapping("/api/notarialService")
@RestController
public class NotarialServiseRestController {

    @Autowired
    NotarialServiceServicesImpl notarialServiceServices;

    @RequestMapping("")
    String getIndex(){
        return "<h1>Index Rest Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello form Notarius service Controller</h1>";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    List<NotarialService> getNotariusServiceList(){
        return notarialServiceServices.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    NotarialService getNotariusService(@PathVariable("id") String id){
        return notarialServiceServices.get(id);
    }

}
