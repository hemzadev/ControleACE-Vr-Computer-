package org.hamzadev.ctrlace;

import org.hamzadev.ctrlace.dto.ComputerDTO;
import org.hamzadev.ctrlace.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CtrlaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtrlaceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ComputerService computerService) {
		return args -> {
			List<ComputerDTO> computers = List.of(
					ComputerDTO.builder()
							.proce("Intel Core i7")
							.ram("16GB")
							.hardDrive("512GB SSD")
							.price(1200.00)
							.macAdress("00-14-22-01-23-45")
							.build(),
					ComputerDTO.builder()
							.proce("AMD Ryzen 5")
							.ram("8GB")
							.hardDrive("1TB HDD")
							.price(900.00)
							.macAdress("00-16-36-02-34-56")
							.build(),
					ComputerDTO.builder()
							.proce("Intel Core i5")
							.ram("8GB")
							.hardDrive("256GB SSD")
							.price(750.00)
							.macAdress("00-18-48-03-45-67")
							.build(),
					ComputerDTO.builder()
							.proce("AMD Ryzen 7")
							.ram("32GB")
							.hardDrive("1TB SSD")
							.price(1500.00)
							.macAdress("00-20-50-04-56-78")
							.build()
			);

			computers.forEach(computerService::saveComputer);
		};
	}



}
