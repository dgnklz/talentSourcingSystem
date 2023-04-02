package com.dgnklz.talentsourcingsystem.repository.abstracts;

import com.dgnklz.talentsourcingsystem.entities.CandidateInteraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateInteractionRepository extends JpaRepository<CandidateInteraction, Integer> {

}
