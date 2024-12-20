package org.hamzadev.ctrlace.web;


import lombok.AllArgsConstructor;
import org.hamzadev.ctrlace.dto.ComputerDTO;
import org.hamzadev.ctrlace.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ComputerGraphQLController {

    private ComputerService computerService;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument("Computer") ComputerDTO computerDTO){
        return computerService.saveComputer(computerDTO);
    }

    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce) {
        List<ComputerDTO> results = computerService.getComputerByProce(proce);
        return results;
    }


}
