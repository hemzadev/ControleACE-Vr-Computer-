package org.hamzadev.ctrlace.service;

import org.hamzadev.ctrlace.dao.entities.Computer;
import org.hamzadev.ctrlace.dao.repositories.ComputerRepository;
import org.hamzadev.ctrlace.dto.ComputerDTO;

import java.util.List;

public interface ComputerService {

    public ComputerDTO saveComputer(ComputerDTO computerDTO);
    public List<ComputerDTO> getComputerByProce(String proce);
}
