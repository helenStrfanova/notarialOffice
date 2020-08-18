package sas.edu.notarial_office.servises.discount.impls;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 17 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas.edu.notarial_office.datastorage.DataFake;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.repository.DiscountRepository;
import sas.edu.notarial_office.servises.discount.interfaces.IDiscountServises;

import java.util.List;

@Service
public class DiscountServisesImpls implements IDiscountServises {
//    @Autowired
//    DaoDiscountImps daoDiscountImps;

    @Autowired
    DiscountRepository discountRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Discount create(Discount discount) {
        return discountRepository.save(discount);
    }

    @Override
    public Discount get(String id) {
        return discountRepository.findById(id).orElse(null);
    }

    @Override
    public Discount delete(String id) {
        Discount discount = this.get(id);
        discountRepository.deleteById(discount.getId());
        return discount;
    }

    @Override
    public Discount update(Discount discount) {
        return discountRepository.save(discount);
    }

    @Override
    public List<Discount> getAll() {
        return discountRepository.findAll();
    }

    public void reloadDatabase(){
        dataFake.init();
    }
}
