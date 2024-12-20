package org.hamzadev.ctrlace.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ComputerDTO {
    String proce;
    String ram;
    String hardDrive;
    Double price;
    String macAdress;
}
