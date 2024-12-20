package org.hamzadev.ctrlace.service;

import lombok.AllArgsConstructor;
import org.hamzadev.ctrlace.dao.entities.Computer;
import org.hamzadev.ctrlace.dao.repositories.ComputerRepository;
import org.hamzadev.ctrlace.dto.ComputerDTO;
import org.hamzadev.ctrlace.mapper.ComputerMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;
    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        if (computerDTO == null) {
            throw new IllegalArgumentException("ComputerDTO cannot be null");
        }

        Computer computer = computerMapper.fromComputerDtoToComputer(computerDTO);
        computer = computerRepository.save(computer);
        return computerMapper.fromComputerToComputerDto(computer);
    }

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();
        for (Computer computer : computers){
            computerDTOS.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDTOS;
    }
}
