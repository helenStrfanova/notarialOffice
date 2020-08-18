package sas.edu.notarial_office.controller.rest;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 17 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.servises.discount.impls.DiscountServisesImpls;

import java.util.List;

@RequestMapping("/api/discount")
@RestController
public class DiscountRestController {

    @Autowired
    DiscountServisesImpls discountServises;

    @RequestMapping("")
    String getIndex(){
        return "<h1>Index Web Controller</h1>";
    }


    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello form discount controller</h1>";
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    List<Discount> getDiscountList(){
        return discountServises.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Discount getDiscount(@PathVariable("id") String id){
        return discountServises.get(id);
    }

}
