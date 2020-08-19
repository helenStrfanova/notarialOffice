package sas.edu.notarial_office.servises.notarialService.impls;/*
 * @author Alona Sviridova
 * @version 1
 * Project name: "notarialOffice"
 * 19 Aug 2020
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas.edu.notarial_office.datastorage.DataFake;
import sas.edu.notarial_office.model.NotarialService;
import sas.edu.notarial_office.repository.NotarialServiceRepository;
import sas.edu.notarial_office.servises.notarialService.interfaces.INotarialServiceServices;

import java.util.List;

@Service
public class NotarialServiceServicesImpl implements INotarialServiceServices {

    @Autowired
    NotarialServiceRepository notarialServiceRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public NotarialService create(NotarialService notarialService) {
        return notarialServiceRepository.save(notarialService);
    }

    @Override
    public NotarialService get(String id) {
        return notarialServiceRepository.findById(id).orElse(null);
    }

    @Override
    public NotarialService delete(String id) {
        NotarialService notarialService = this.get(id);
        notarialServiceRepository.deleteById(notarialService.getId());
        return notarialService;
    }

    @Override
    public NotarialService update(NotarialService notarialService) {
        return notarialServiceRepository.save(notarialService);
    }

    @Override
    public List<NotarialService> getAll() {
        return notarialServiceRepository.findAll();
    }

    public void reloadDatabase(){
        dataFake.init();
    }
}
