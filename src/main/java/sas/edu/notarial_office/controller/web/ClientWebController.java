package sas.edu.notarial_office.controller.web;/*
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
import sas.edu.notarial_office.form.ClientForm;
import sas.edu.notarial_office.form.DiscountForm;
import sas.edu.notarial_office.model.Client;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.servises.client.impls.ClientServicesImpl;
import sas.edu.notarial_office.servises.discount.impls.DiscountServisesImpls;

@Controller
@RequestMapping("/web/client")
public class ClientWebController {

    @Autowired
    ClientServicesImpl clientServices;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String showAll(Model model) {
        model.addAttribute("list", clientServices.getAll());
        return "clientList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCient(@PathVariable("id") String id, Model model) {

        clientServices.delete(id);
        model.addAttribute("list", clientServices.getAll());
        return "redirect:/web/client/get/list";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    String getClientInfo(@PathVariable("id") String id, Model model) {
        Client client = clientServices.get(id);
        model.addAttribute("list", clientServices.getAll());
        return client.toString();
    }

    @RequestMapping("/reloadDB")
    String reloadDatabase() {
        clientServices.reloadDatabase();
        return "redirect:/web/client/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createClient(Model model) {
        ClientForm clientForm = new ClientForm();
        model.addAttribute("clientForm", clientForm);
        return "addClient";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createClient(Model model, @ModelAttribute("clientForm") ClientForm clientForm) {
        Client client = new Client();
        client.setFirstName(clientForm.getFirstName());
        client.setLastName(clientForm.getLastName());
        client.setAddress(clientForm.getAddress());
        client.setDiscount(clientForm.getDiscount());
        clientServices.create(client);

        model.addAttribute("client", clientServices.getAll());
        return "redirect:/web/client/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateClient(@PathVariable("id") String id, Model model) {
        Client client = clientServices.get(id);
        ClientForm clientForm = new ClientForm(
                client.getId(),
                client.getFirstName(),
                client.getLastName(),
                client.getAddress(),
                client.getDiscount()
        );
        model.addAttribute("clientForm", clientForm);
        return "updateClient";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateClient(Model model, @ModelAttribute("clientForm") ClientForm clientForm) {
        Client client = new Client();
        client.setId(clientForm.getId());
        client.setFirstName(clientForm.getFirstName());
        client.setLastName(clientForm.getLastName());
        client.setAddress(clientForm.getAddress());
        client.setDiscount(clientForm.getDiscount());
        clientServices.update(client);

        model.addAttribute("client", clientServices.getAll());
        return "redirect:/web/client/get/list";
    }
}
