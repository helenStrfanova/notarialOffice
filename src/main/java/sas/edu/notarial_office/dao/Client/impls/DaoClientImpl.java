package sas.edu.notarial_office.dao.Client.impls;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sas.edu.notarial_office.dao.Client.iterfaces.IDaoClient;
import sas.edu.notarial_office.datastorage.DataFake;
import sas.edu.notarial_office.model.Client;

import java.util.List;

@Repository
public class DaoClientImpl implements IDaoClient {

    @Autowired
    DataFake dataFake;

    @Override
    public Client create(Client client) {
        return null;
    }

    @Override
    public Client get(String id) {
        return null;
    }

    @Override
    public Client delete(String id) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return dataFake.getClients();
    }
}
