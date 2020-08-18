package sas.edu.notarial_office.datastorage;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 17 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.repository.DiscountRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    DiscountRepository discountRepository;

    List<Discount> discounts = new LinkedList<>(Arrays.asList(
            new Discount("Small", 5),
            new Discount("Medium", 10),
            new Discount("Large", 15)));

    @PostConstruct
    public void init(){
        discountRepository.deleteAll();
        discountRepository.saveAll(discounts);
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

}
