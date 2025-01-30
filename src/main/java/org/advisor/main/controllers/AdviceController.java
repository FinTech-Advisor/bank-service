package org.advisor.main.controllers;


import org.advisor.main.services.AdviceService;
import org.springframework.web.bind.annotation.*;
import org.advisor.main.entities.*;
import java.util.List;

@RestController
@RequestMapping("/service/advice")
public class AdviceController {
    private final AdviceService adviceService;

    public AdviceController(AdviceService adviceService) {
        this.adviceService = adviceService;
    }

    @GetMapping("/list")
    public List<Advice> getAdviceList() {
        return adviceService.getAllAdvices();
    }

    @GetMapping("/view/{seq}")
    public Advice getAdviceDetail(@PathVariable Long seq) {
        return adviceService.getAdviceById(seq);
    }
}