package sas.edu.notarial_office.dao.NotarialService.impls;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sas.edu.notarial_office.dao.NotarialService.interfaces.IDaoNotarialService;
import sas.edu.notarial_office.datastorage.DataFake;
import sas.edu.notarial_office.model.NotarialService;

import java.util.List;

@Repository
public class DaoNotarialServiceImpl implements IDaoNotarialService {

    @Autowired
    DataFake dataFake;

    @Override
    public NotarialService create(NotarialService notarialService) {
        return null;
    }

    @Override
    public NotarialService get(String id) {
        return null;
    }

    @Override
    public NotarialService delete(String id) {
        return null;
    }

    @Override
    public NotarialService update(NotarialService notarialService) {
        return null;
    }

    @Override
    public List<NotarialService> getAll() {
        return null;
    }
}
