package com.dgnklz.talentsourcingsystem.entities.constants;

import com.dgnklz.talentsourcingsystem.entities.CadidateInteraction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "interactionTypes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InteractionType {
    @Id
    @Column(name = "id", updatable = false)
    private int id;

    @Column(name = "interactionTypeName")
    private String interactionTypeName;

    @OneToMany(mappedBy = "interactionType")
    private List<CadidateInteraction> cadidateInteractions;
}
