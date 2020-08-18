package sas.edu.notarial_office.servises.discount.interfaces;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 17 Aug 2020
 */

import sas.edu.notarial_office.model.Discount;

import java.util.List;

public interface IDiscountServises {

    Discount create(Discount discont);
    Discount get(String id);
    Discount delete(String id);
    Discount update(Discount discont);
    List<Discount> getAll();

}
