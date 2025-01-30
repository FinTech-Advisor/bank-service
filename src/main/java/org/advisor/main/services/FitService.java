package org.advisor.main.services;

import org.advisor.main.entities.Fit;
import org.advisor.main.repositories.FitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitService {
    private final FitRepository fitRepository;

    public FitService(FitRepository fitRepository) {
        this.fitRepository = fitRepository;
    }

    public List<Fit> getAllFits() {
        return fitRepository.findAll();
    }

    public Fit getFitById(Long id) {
        return fitRepository.findById(id).orElse(null);
    }
}