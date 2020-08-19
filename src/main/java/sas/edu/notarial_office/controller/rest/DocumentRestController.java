package sas.edu.notarial_office.controller.rest;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sas.edu.notarial_office.model.Document;
import sas.edu.notarial_office.servises.document.impls.DocumentServicesImpl;
import java.util.List;

@RequestMapping("/api/document")
@RestController
public class DocumentRestController {

    @Autowired
    DocumentServicesImpl documentServices;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    List<Document> getDocumentList(){
        return documentServices.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Document getClient(@PathVariable("id") String id){
        return documentServices.get(id);
    }
}
