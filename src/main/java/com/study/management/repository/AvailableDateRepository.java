package com.study.management.repository;

import com.study.management.entity.AvailableDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableDateRepository extends JpaRepository<AvailableDate, Long> {
}
