package sas.edu.notarial_office.dao.Client.iterfaces;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import sas.edu.notarial_office.model.Client;

import java.util.List;

public interface IDaoClient {

    Client create(Client client);
    Client get(String id);
    Client delete(String id);
    Client update(Client client);
    List<Client> getAll();
}
