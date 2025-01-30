package org.advisor.main.controllers;

import org.advisor.main.entities.Issue;
import org.advisor.main.services.IssueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service/issue")
public class IssueController {
    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/list")
    public List<Issue> getIssueList() {
        return issueService.getAllIssues();
    }

    @GetMapping("/view/{seq}")
    public Issue getIssueDetail(@PathVariable Long seq) {
        return issueService.getIssueById(seq);
    }
}