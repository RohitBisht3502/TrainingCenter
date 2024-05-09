package com.Buyogo.Center.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Center {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @Pattern(regexp = "[a-zA-Z0-9]{12}")
    private String centerCode;

    @Embedded
    private Address address;

    @Min(0)
    private int studentCapacity;

    private List<String> coursesOffered;

    private LocalDateTime createdOn;

    @Email
    private String contactEmail;

    @Pattern(regexp="\\d{10}")
    private String contactPhone;

}
