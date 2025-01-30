package org.advisor.main.repositories;

import org.advisor.main.entities.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {}
