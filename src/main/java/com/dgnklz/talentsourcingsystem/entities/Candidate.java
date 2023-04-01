package com.dgnklz.talentsourcingsystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "candidates")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(mappedBy = "candidate", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CadidateInteraction cadidateInteraction;
}