package com.dgnklz.talentsourcingsystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "candidateInteractions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadidateInteraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidateId")
    @MapsId
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Candidate candidate;
}