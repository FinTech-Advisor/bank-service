package org.advisor.main.repositories;

import org.advisor.main.entities.Advice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdviceRepository extends JpaRepository<Advice, Long> {
}
