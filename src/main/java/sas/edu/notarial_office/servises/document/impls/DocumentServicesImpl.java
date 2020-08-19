package sas.edu.notarial_office.servises.document.impls;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas.edu.notarial_office.datastorage.DataFake;
import sas.edu.notarial_office.model.Document;
import sas.edu.notarial_office.repository.DocumentRepository;
import sas.edu.notarial_office.servises.document.interfaces.IDocumentServices;

import java.util.List;

@Service
public class DocumentServicesImpl implements IDocumentServices {


    @Autowired
    DocumentRepository documentRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Document create(Document document) {
        return documentRepository.save(document);
    }

    @Override
    public Document get(String id) {
        return documentRepository.findById(id).orElse(null);
    }

    @Override
    public Document delete(String id) {
        Document document = this.get(id);
        documentRepository.deleteById(document.getId());
        return document;
    }

    @Override
    public Document update(Document document) {
        return documentRepository.save(document);
    }

    @Override
    public List<Document> getAll() {
        return documentRepository.findAll();
    }

    public void reloadDatabase(){
        dataFake.init();
    }
}
