package com.dgnklz.talentsourcingsystem.entities;

import com.dgnklz.talentsourcingsystem.entities.constants.InteractionType;
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
public class CandidateInteraction {
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "interactionTypeId")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private InteractionType interactionType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidateId")
    @MapsId
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Candidate candidate;
}