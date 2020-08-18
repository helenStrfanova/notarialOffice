package sas.edu.notarial_office.dao.Discount.impls;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 17 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sas.edu.notarial_office.dao.Discount.interfaces.IDaoDiscount;
import sas.edu.notarial_office.datastorage.DataFake;
import sas.edu.notarial_office.model.Discount;

import java.util.List;

@Repository
public class DaoDiscountImps implements IDaoDiscount {

    @Autowired
    DataFake dataFake;

    @Override
    public Discount create(Discount discont) {
        return null;
    }

    @Override
    public Discount get(String id) {
        return null;
    }

    @Override
    public Discount delete(String id) {
        return null;
    }

    @Override
    public Discount update(Discount discont) {
        return null;
    }

    @Override
    public List<Discount> getAll() {
        return dataFake.getDiscounts();
    }
}


