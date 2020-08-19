package sas.edu.notarial_office.dao.Document.impls;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import sas.edu.notarial_office.dao.Document.interface1.IDaoDocument;
import sas.edu.notarial_office.datastorage.DataFake;
import sas.edu.notarial_office.model.Document;

import java.util.List;

public class DaoDocumentImpl implements IDaoDocument {

    @Autowired
    DataFake dataFake;

    @Override
    public Document create(Document document) {
        return null;
    }

    @Override
    public Document get(String id) {
        return null;
    }

    @Override
    public Document delete(String id) {
        return null;
    }

    @Override
    public Document update(Document document) {
        return null;
    }

    @Override
    public List<Document> getAll() {
        return dataFake.getDocuments();
    }
}
