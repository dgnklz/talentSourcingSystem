package com.dgnklz.talentsourcingsystem.entities.constants;

import com.dgnklz.talentsourcingsystem.entities.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "previousInteractions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousInteraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private int id;

    @Column(name = "previousInteractionName")
    private String previousInteractionName;

    @OneToMany(mappedBy = "previousInteraction")
    private List<Candidate> candidates;

}
