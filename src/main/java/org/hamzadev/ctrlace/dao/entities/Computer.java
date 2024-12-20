package org.hamzadev.ctrlace.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Computer {
    @Id
    @GeneratedValue
    Long id_Computer;
    String proce;
    String ram;
    String hardDrive;
    Double price;
    String macAdress;
}
