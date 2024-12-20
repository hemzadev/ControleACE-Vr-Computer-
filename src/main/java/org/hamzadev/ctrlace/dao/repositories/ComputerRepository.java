package org.hamzadev.ctrlace.dao.repositories;

import org.hamzadev.ctrlace.dao.entities.Computer;
import org.springframework.cache.CacheManager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    public List<Computer> findByProce(String proce);
}
