package sas.edu.notarial_office.datastorage;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 17 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sas.edu.notarial_office.model.Client;
import sas.edu.notarial_office.model.Discount;
import sas.edu.notarial_office.model.Document;
import sas.edu.notarial_office.model.NotarialService;
import sas.edu.notarial_office.repository.ClientRepository;
import sas.edu.notarial_office.repository.DiscountRepository;
import sas.edu.notarial_office.repository.DocumentRepository;
import sas.edu.notarial_office.repository.NotarialServiceRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    DiscountRepository discountRepository;
    @Autowired
    NotarialServiceRepository notarialServiceRepository;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    DocumentRepository documentRepository;


    List<Discount> discounts = new LinkedList<>(Arrays.asList(
            new Discount("Small", 5),
            new Discount("Medium", 10),
            new Discount("Large", 15)));

    List<NotarialService> notarialServices = new LinkedList<>(Arrays.asList(
            new NotarialService("Translate", "Translate public documents for government"),
            new NotarialService("Apostil", "Make apostil on the document."),
            new NotarialService("Testament", "Help in making a testament")));

    List<Client> clients = new LinkedList<>(Arrays.asList(
            new Client("Alex", "Kachmar","Novoyavorivsk","+380998826577", discounts.get(0)),
            new Client("Ivan", "Malik","PoltOva","+380974456578", discounts.get(1)),
            new Client("Anton", "Karatyt","Merefa","+3809689751", discounts.get(2))
            ));

    List<Document> documents = new LinkedList<>(Arrays.asList(
            new Document(notarialServices.get(0),66.4,2.2),
            new Document(notarialServices.get(1),102.02,0.9),
            new Document(notarialServices.get(2),364,10)));

    @PostConstruct
    public void init(){
        discountRepository.deleteAll();
        discountRepository.saveAll(discounts);
        notarialServiceRepository.deleteAll();
        notarialServiceRepository.saveAll(notarialServices);
        clientRepository.deleteAll();
        clientRepository.saveAll(clients);
        documentRepository.deleteAll();
        documentRepository.saveAll(documents);
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }
    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public List<NotarialService> getNotarialServices() {
        return notarialServices;
    }
    public void setNotarialService(List<NotarialService> notarialService) {
        this.notarialServices = notarialService;
    }

    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Document> getDocuments() {
        return documents;
    }
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
