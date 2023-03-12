package com.application.bas.repository;

import com.application.bas.entity.BoughtBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountingRepository extends JpaRepository<BoughtBook, Long> {
}
