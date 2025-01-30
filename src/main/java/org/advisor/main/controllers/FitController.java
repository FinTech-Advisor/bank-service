package org.advisor.main.controllers;

import org.advisor.main.entities.Fit;
import org.advisor.main.services.FitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service/fit")
public class FitController {
    private final FitService fitService;

    public FitController(FitService fitService) {
        this.fitService = fitService;
    }

    @GetMapping("/list")
    public List<Fit> getFitList() {
        return fitService.getAllFits();
    }

    @GetMapping("/view/{seq}")
    public Fit getFitDetail(@PathVariable Long seq) {
        return fitService.getFitById(seq);
    }
}
