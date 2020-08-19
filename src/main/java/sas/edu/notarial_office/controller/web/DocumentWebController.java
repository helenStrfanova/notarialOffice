package sas.edu.notarial_office.controller.web;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sas.edu.notarial_office.form.DocumentForm;
import sas.edu.notarial_office.model.Document;
import sas.edu.notarial_office.model.NotarialService;
import sas.edu.notarial_office.servises.document.impls.DocumentServicesImpl;
import sas.edu.notarial_office.servises.notarialService.impls.NotarialServiceServicesImpl;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/web/document")
public class DocumentWebController {

    @Autowired
    DocumentServicesImpl documentServices;

    @Autowired
    NotarialServiceServicesImpl notarialServiceServices;

    Map<String, String> movs;

    @PostConstruct
    void init(){

        movs = new HashMap<>();
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String showAll(Model model) {
        model.addAttribute("list", documentServices.getAll());
        return "documentList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteDocument(@PathVariable("id") String id, Model model) {

        documentServices.delete(id);
        model.addAttribute("list", documentServices.getAll());
        return "redirect:/web/document/get/list";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    String getDocumentInfo(@PathVariable("id") String id, Model model) {
        Document document = documentServices.get(id);
        model.addAttribute("list", documentServices.getAll());
        return document.toString();
    }

    @RequestMapping("/reloadDB")
    String reloadDatabase() {
        documentServices.reloadDatabase();
        return "redirect:/web/document/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createDocument(Model model) {
        DocumentForm documentForm = new DocumentForm();
        for (NotarialService notarialService:notarialServiceServices.getAll()){
            movs.put(notarialService.getId(),notarialService.getName());
        }
        model.addAttribute("movs",movs);
        model.addAttribute("documentForm", documentForm);
        return "addDocument";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createDocument(Model model, @ModelAttribute("documentForm") DocumentForm documentForm) {
        Document document = new Document();
        document.setNotarialService(documentForm.getNotarialService());
        document.setNotarialServicePrice(documentForm.getNotarialServicePrice());
        document.setCommission(documentForm.getCommission());
        documentServices.create(document);

        model.addAttribute("document", documentServices.getAll());
        return "redirect:/web/document/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateDocument(@PathVariable("id") String id, Model model) {
        Document document = documentServices.get(id);
        DocumentForm documentForm = new DocumentForm(
                document.getId(),
                document.getNotarialService(),
                document.getNotarialServicePrice(),
                document.getCommission()
        );
        for (NotarialService notarialService:notarialServiceServices.getAll()){
            movs.put(notarialService.getId(),notarialService.getName());
        }
        model.addAttribute("movs",movs);
        model.addAttribute("documentForm", documentForm);
        return "updateDocument";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateDocument(Model model, @ModelAttribute("documentForm") DocumentForm documentForm) {
        Document document = new Document();
        document.setId(documentForm.getId());
        document.setNotarialService(documentForm.getNotarialService());
        document.setNotarialServicePrice(documentForm.getNotarialServicePrice());
        document.setCommission(documentForm.getCommission());
        documentServices.update(document);
        model.addAttribute("document", documentServices.getAll());
        return "redirect:/web/document/get/list";
    }

}
