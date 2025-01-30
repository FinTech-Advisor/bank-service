package org.advisor.main.repositories;

import org.advisor.main.entities.Datas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Datas, Long> {}
