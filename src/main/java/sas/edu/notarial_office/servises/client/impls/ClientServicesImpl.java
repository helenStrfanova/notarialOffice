package sas.edu.notarial_office.servises.client.impls;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas.edu.notarial_office.datastorage.DataFake;
import sas.edu.notarial_office.model.Client;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.repository.ClientRepository;
import sas.edu.notarial_office.repository.DiscountRepository;
import sas.edu.notarial_office.servises.client.interfaces.IClientServices;

import java.util.List;

@Service
public class ClientServicesImpl implements IClientServices {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client get(String id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client delete(String id) {
        Client client = this.get(id);
        clientRepository.deleteById(client.getId());
        return client;
    }

    @Override
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public void reloadDatabase(){
        dataFake.init();
    }
}
