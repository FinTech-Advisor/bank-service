package org.advisor.main.services;

import org.advisor.main.entities.Advice;
import org.advisor.main.repositories.AdviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviceService {
    private final AdviceRepository adviceRepository;

    public AdviceService(AdviceRepository adviceRepository) {
        this.adviceRepository = adviceRepository;
    }

    public List<Advice> getAllAdvices() {
        return adviceRepository.findAll();
    }

    public Advice getAdviceById(Long id) {
        return adviceRepository.findById(id).orElse(null);
    }
}