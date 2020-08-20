package sas.edu.notarial_office.controller.rest;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 20 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sas.edu.notarial_office.model.Agreement;
import sas.edu.notarial_office.servises.agreement.impls.AgreementServicesImpl;

import java.util.List;

@RequestMapping("/api/agreement")
@RestController
public class AgreementRestController {

    @Autowired
    AgreementServicesImpl agreementServices;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    List<Agreement> getAgreementList(){
        return agreementServices.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Agreement getAgreement(@PathVariable("id") String id){
        return agreementServices.get(id);
    }

}
