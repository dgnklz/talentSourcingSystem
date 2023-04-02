package com.dgnklz.talentsourcingsystem.entities.constants;

import com.dgnklz.talentsourcingsystem.entities.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidateStatuses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateStatus {
    @Id
    @Column(name = "id", updatable = false)
    private int id;

    @Column(name = "candidateStatusName")
    private String candidateStatusName;

    @OneToMany(mappedBy = "candidateStatus")
    private List<Candidate> candidates;
}
