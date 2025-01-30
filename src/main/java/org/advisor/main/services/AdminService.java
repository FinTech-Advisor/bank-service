package org.advisor.main.services;

import org.advisor.main.entities.Datas;
import org.advisor.main.entities.Issue;
import org.advisor.main.repositories.DataRepository;
import org.advisor.main.repositories.IssueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final DataRepository dataRepository;
    private final IssueRepository issueRepository;

    public AdminService(DataRepository dataRepository, IssueRepository issueRepository) {
        this.dataRepository = dataRepository;
        this.issueRepository = issueRepository;
    }

    public List<Datas> getAllAdminData() {
        return dataRepository.findAll();
    }

    public List<Issue> getAllAdminIssues() {
        return issueRepository.findAll();
    }
}