package sas.edu.notarial_office.servises.document.interfaces;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import sas.edu.notarial_office.model.Document;

import java.util.List;

public interface IDocumentServices {

    Document create(Document document);
    Document get(String id);
    Document delete(String id);
    Document update(Document document);
    List<Document> getAll();

}
