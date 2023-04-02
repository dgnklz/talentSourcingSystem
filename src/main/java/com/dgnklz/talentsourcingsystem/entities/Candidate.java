package com.dgnklz.talentsourcingsystem.entities;

import com.dgnklz.talentsourcingsystem.entities.constants.CandidateStatus;
import com.dgnklz.talentsourcingsystem.entities.constants.PreviousInteraction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @Column(name = "nameSurname")
    private String nameSurname;

    @Column(name = "contactInformation")
    private String contactInformation;

    @ManyToOne
    @JoinColumn(name = "previousInteractionId")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private PreviousInteraction previousInteraction;

    @ManyToOne
    @JoinColumn(name = "candidateStatusId")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private CandidateStatus candidateStatus;

    @OneToOne(mappedBy = "candidate", fetch = FetchType.EAGER)
    private CandidateInteraction candidateInteraction;
}