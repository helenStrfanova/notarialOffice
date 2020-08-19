package sas.edu.notarial_office.controller.web;
/*
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
import sas.edu.notarial_office.form.DiscountForm;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.servises.discount.impls.DiscountServisesImpls;

@Controller
@RequestMapping("/web/discount")
public class DiscountWebController {

    @Autowired
    DiscountServisesImpls discountServisesImpls;

   /* @RequestMapping("/get/list")
    String showAll(Model model) {
        model.addAttribute("list", discountServisesImpls.getAll());
        return "discountlist";
    }*/

    @RequestMapping(value = "/get/list", method =RequestMethod.GET)
    String showAll(Model model){
        model.addAttribute("list",discountServisesImpls.getAll());
        return "discountlist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteDiscount(@PathVariable("id") String id, Model model) {

        discountServisesImpls.delete(id);
        model.addAttribute("list", discountServisesImpls.getAll());
        return "redirect:/web/discount/get/list";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    String getDiscountInfo(@PathVariable("id") String id, Model model) {
        Discount discount = discountServisesImpls.get(id);
        model.addAttribute("list", discountServisesImpls.getAll());
        return discount.toString();
    }

    @RequestMapping("/reloadDB")
    String reloadDatabase() {
        discountServisesImpls.reloadDatabase();
        return "redirect:/web/discount/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createDiscount(Model model) {
        DiscountForm discountForm = new DiscountForm();
        model.addAttribute("discountForm", discountForm);
        return "addDiscount";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createDiscount(Model model, @ModelAttribute("discountForm") DiscountForm discountForm) {
        Discount discount = new Discount();
        discount.setName(discountForm.getName());
        discount.setPercentageDiscount(discountForm.getPercentageDiscount());
        discountServisesImpls.create(discount);

        model.addAttribute("discount", discountServisesImpls.getAll());
        return "redirect:/web/discount/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateDiscount(@PathVariable("id") String id,Model model){
        Discount discount = discountServisesImpls.get(id);
        DiscountForm discountForm = new DiscountForm(
                discount.getId(),
                discount.getName(),
                discount.getPercentageDiscount()
        );
        model.addAttribute("discountForm", discountForm);
        return "updateDiscount";
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateDiscount(Model model, @ModelAttribute("discountForm") DiscountForm discountForm) {
        Discount discount = new Discount();
        discount.setId(discountForm.getId());
        discount.setName(discountForm.getName());
        discount.setPercentageDiscount(discountForm.getPercentageDiscount());
        discountServisesImpls.update(discount);

        model.addAttribute("discount", discountServisesImpls.getAll());
        return "redirect:/web/discount/get/list";
    }
}
