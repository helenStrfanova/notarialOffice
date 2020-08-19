package sas.edu.notarial_office.servises.notarialService.interfaces;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import sas.edu.notarial_office.model.NotarialService;
import java.util.List;

public interface INotarialServiceServices {

    NotarialService create(NotarialService notarialService);
    NotarialService get(String id);
    NotarialService delete(String id);
    NotarialService update(NotarialService notarialService);
    List<NotarialService> getAll();


}
