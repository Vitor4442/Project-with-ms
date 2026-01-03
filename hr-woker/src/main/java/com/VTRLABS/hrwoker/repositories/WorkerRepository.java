package com.VTRLABS.hrwoker.repositories;

import com.VTRLABS.hrwoker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
