package org.advisor.main.controllers;

import org.advisor.main.entities.Datas;
import org.advisor.main.entities.Issue;
import org.advisor.main.services.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/data/list")
    public List<Datas> getAdminDataList() {
        return adminService.getAllAdminData();
    }

    @GetMapping("/issue/list")
    public List<Issue> getAdminIssueList() {
        return adminService.getAllAdminIssues();
    }
}