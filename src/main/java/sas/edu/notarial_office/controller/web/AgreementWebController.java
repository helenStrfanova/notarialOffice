package sas.edu.notarial_office.controller.web;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 20 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sas.edu.notarial_office.form.AgreementForm;
import sas.edu.notarial_office.model.Agreement;
import sas.edu.notarial_office.model.Client;
import sas.edu.notarial_office.model.Document;
import sas.edu.notarial_office.servises.agreement.impls.AgreementServicesImpl;
import sas.edu.notarial_office.servises.client.impls.ClientServicesImpl;
import sas.edu.notarial_office.servises.document.impls.DocumentServicesImpl;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/web/agreement")
public class AgreementWebController {

    @Autowired
    AgreementServicesImpl agreementServices;

    @Autowired
    DocumentServicesImpl documentServices;

    @Autowired
    ClientServicesImpl clientServices;

    Map<String, String> movs;
    Map<String, String> mavs;

    @PostConstruct
    void init(){

        movs = new HashMap<>();
        mavs = new HashMap<>();
    }

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String showAll(Model model) {
        model.addAttribute("list", agreementServices.getAll());
        return "agreementList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteAgreement(@PathVariable("id") String id, Model model) {

        agreementServices.delete(id);
        model.addAttribute("list", agreementServices.getAll());
        return "redirect:/web/agreement/get/list";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    String getAgreementInfo(@PathVariable("id") String id, Model model) {
        Agreement agreement = agreementServices.get(id);
        model.addAttribute("list", agreementServices.getAll());
        return agreement.toString();
    }

    @RequestMapping("/reloadDB")
    String reloadDatabase() {
        agreementServices.reloadDatabase();
        return "redirect:/web/agreement/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createAgreement(Model model) {
        AgreementForm agreementForm = new AgreementForm();
        for (Client client:clientServices.getAll()){
            movs.put(client.getId(),client.getLastName());
        }
        for (Document document:documentServices.getAll()){
            mavs.put(document.getId(),document.getNotarialService().getName());
        }
        model.addAttribute("movs",movs);
        model.addAttribute("mavs",mavs);
        model.addAttribute("agreementForm", agreementForm);
        return "addAgreement";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createAgreement(Model model, @ModelAttribute("agreementForm") AgreementForm agreementForm) {
        Agreement agreement = new Agreement();
        agreement.setClient(agreementForm.getClient());
        agreement.setDocument(agreementForm.getDocument());
        agreement.setCommission(agreementForm.getCommission());
        agreement.setPrise(agreementForm.getPrise());
        agreement.setDescription(agreementForm.getDescription());
        agreementServices.create(agreement);

        model.addAttribute("agreement", agreementServices.getAll());
        return "redirect:/web/agreement/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateAgreement(@PathVariable("id") String id, Model model) {
        Agreement agreement = agreementServices.get(id);
        AgreementForm agreementForm = new AgreementForm(
                agreement.getId(),
                agreement.getDocument(),
                agreement.getClient(),
                agreement.getPrise(),
                agreement.getCommission(),
                agreement.getDescription()
        );
        for (Client client : clientServices.getAll()) {
            movs.put(client.getId(), client.getLastName());
        }
        for (Document document : documentServices.getAll()) {
            movs.put(document.getId(), document.getNotarialService().getName());
        }
        model.addAttribute("movs", movs);
        model.addAttribute("mavs", mavs);
        model.addAttribute("agreementForm", agreementForm);
        return "updateAgreement";
    }

        @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
        public String updateAgreement(Model model, @PathVariable("id") String id, @ModelAttribute("agreementForm") AgreementForm agreementForm){
            Agreement agreement = new Agreement();
            agreement.setId(id);
            agreement.setClient(agreementForm.getClient());
            agreement.setDocument(agreementForm.getDocument());
            agreement.setPrise(agreementForm.getPrise());
            agreement.setCommission(agreementForm.getCommission());
            agreement.setDescription(agreementForm.getDescription());
            agreementServices.update(agreement);
            model.addAttribute("agreement",agreementServices.getAll());
            return "redirect:/web/agreement/get/list";
        }
}
