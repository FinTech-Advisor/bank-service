package org.advisor.main.services;

import org.advisor.main.entities.Datas;
import org.advisor.main.repositories.DataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    private final DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<Datas> getAllData() {
        return dataRepository.findAll();
    }

    public Datas getDataById(Long id) {
        return dataRepository.findById(id).orElse(null);
    }
}