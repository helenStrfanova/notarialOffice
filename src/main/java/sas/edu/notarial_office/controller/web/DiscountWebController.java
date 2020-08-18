package sas.edu.notarial_office.controller.web;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 17 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.servises.discount.impls.DiscountServisesImpls;

@Controller
@RequestMapping("/web/discount")
public class DiscountWebController {

    @Autowired
    DiscountServisesImpls discountServisesImpls;

    @RequestMapping("/get/list")
    String showAll(Model model) {
        model.addAttribute("list", discountServisesImpls.getAll());
        return "cdiscountlist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteDiscount(@PathVariable("id") String id, Model model) {

        discountServisesImpls.delete(id);
        model.addAttribute("list", discountServisesImpls.getAll());
        return "redirect:/web/cafedra/get/list";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    String getDiscountInfo(@PathVariable("id") String id, Model model) {
        Discount discount = discountServisesImpls.get(id);
        model.addAttribute("list", discountServisesImpls.getAll());
        return discount.toString();
    }

    /*
    @RequestMapping("/reloadDB")
    String reloadDatabase() {
        discountServisesImpls.reloadDatabase();
        return "redirect:/web/cafedra/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createCafedra(Model model) {
        CafedraForm cafedraForm = new CafedraForm();
        model.addAttribute("cafedraForm", cafedraForm);
        return "addCafedra";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCafedra(Model model, @ModelAttribute("cafedraForm") CafedraForm cafedraForm) {
        Cafedra cafedra = new Cafedra();
        cafedra.setName(cafedraForm.getName());
        cafedra.setDesc(cafedraForm.getDesc());
        cafedra.setChief(cafedraForm.getChief());
        cafedraService.create(cafedra);

        model.addAttribute("cafedras", cafedraService.getAll());
        return "redirect:/web/cafedra/get/list";
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateCafedra(@PathVariable("id") String id,Model model){
        Cafedra cafedra = cafedraService.get(id);
        CafedraForm cafedraForm = new CafedraForm(
                cafedra.getId(),
                cafedra.getName(),
                cafedra.getDesc(),
                cafedra.getChief()
        );
        model.addAttribute("cafedraForm", cafedraForm);
        return "updateCafedra";
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateCafedra(Model model, @ModelAttribute("cafedraForm") CafedraForm cafedraForm) {
        Cafedra cafedra = new Cafedra();
        cafedra.setId(cafedraForm.getId());
        cafedra.setName(cafedraForm.getName());
        cafedra.setDesc(cafedraForm.getDesc());
        cafedra.setChief(cafedraForm.getChief());
        cafedraService.update(cafedra);

        model.addAttribute("cafedras", cafedraService.getAll());
        return "redirect:/web/cafedra/get/list";
    }*/

}
