package org.advisor.main.controllers;


import org.advisor.main.entities.Datas;
import org.advisor.main.services.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service/data")
public class DataController {
    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/list")
    public List<Datas> getDataList() {
        return dataService.getAllData();
    }

    @GetMapping("/view/{seq}")
    public Datas getDataDetail(@PathVariable Long seq) {
        return dataService.getDataById(seq);
    }
}