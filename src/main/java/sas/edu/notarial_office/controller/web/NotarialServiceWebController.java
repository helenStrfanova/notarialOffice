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
import sas.edu.notarial_office.form.DiscountForm;
import sas.edu.notarial_office.form.NotarialServiceForm;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.model.NotarialService;
import sas.edu.notarial_office.servises.notarialService.impls.NotarialServiceServicesImpl;

@Controller
@RequestMapping("/web/notarialService")
public class NotarialServiceWebController {

    @Autowired
    NotarialServiceServicesImpl notarialServiceServicesImpl;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String showAll(Model model){
        model.addAttribute("list",notarialServiceServicesImpl.getAll());
        return "notarialServiceList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteNotarialService(@PathVariable("id") String id, Model model) {

        notarialServiceServicesImpl.delete(id);
        model.addAttribute("list", notarialServiceServicesImpl.getAll());
        return "redirect:/web/notarialService/get/list";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    String getNotarialServiceInfo(@PathVariable("id") String id, Model model) {
        NotarialService notarialService = notarialServiceServicesImpl.get(id);
        model.addAttribute("list", notarialServiceServicesImpl.getAll());
        return notarialService.toString();
    }

    @RequestMapping("/reloadDB")
    String reloadDatabase() {
        notarialServiceServicesImpl.reloadDatabase();
        return "redirect:/web/notarialService/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createNotarialService(Model model) {
        NotarialServiceForm notarialServiceForm = new NotarialServiceForm();
        model.addAttribute("notarialServiceForm", notarialServiceForm);
        return "addNotarialService";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createNotarialService(Model model, @ModelAttribute("notarialServiceForm") NotarialServiceForm notarialServiceForm) {
        NotarialService notarialService = new NotarialService();
        notarialService.setName(notarialServiceForm.getName());
        notarialService.setDescription(notarialServiceForm.getDescription());
        notarialServiceServicesImpl.create(notarialService);

        model.addAttribute("notarialService", notarialServiceServicesImpl.getAll());
        return "redirect:/web/notarialService/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateNotarialService(@PathVariable("id") String id,Model model){
        NotarialService notarialService = notarialServiceServicesImpl.get(id);
        NotarialServiceForm notarialServiceForm = new NotarialServiceForm(
                notarialService.getId(),
                notarialService.getName(),
                notarialService.getDescription()
        );
        model.addAttribute("notarialServiceForm", notarialServiceForm);
        return "updateNotarialService";
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateNotarialService(Model model, @ModelAttribute("notarialServiceForm") NotarialServiceForm notarialServiceForm) {
        NotarialService notarialService = new NotarialService();
        notarialService.setId(notarialServiceForm.getId());
        notarialService.setName(notarialServiceForm.getName());
        notarialService.setDescription(notarialServiceForm.getDescription());
        notarialServiceServicesImpl.update(notarialService);

        model.addAttribute("notarialService", notarialServiceServicesImpl.getAll());
        return "redirect:/web/notarialService/get/list";
    }

}
