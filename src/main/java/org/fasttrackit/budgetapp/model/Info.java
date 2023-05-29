package org.fasttrackit.budgetapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.*;

@Builder
@With
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Info {
    @Id
    @GeneratedValue
    private Integer id;
@Column
    private String product;
@Column
    private String description;

}

