package org.fasttrackit.budgetapp.model;
import jakarta.persistence.*;
import lombok.*;

@Builder(toBuilder = true)
@With
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Budget{
@Id
@GeneratedValue
    private Integer id;
@Column
    private Double amount;
@Column
    private Type type;
@Column
    private Account account;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    private Info info;

}
