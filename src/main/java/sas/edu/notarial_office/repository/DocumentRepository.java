package sas.edu.notarial_office.repository;
/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sas.edu.notarial_office.model.Document;

@Repository
public interface DocumentRepository extends MongoRepository<Document,String> {
}
