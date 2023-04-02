package com.dgnklz.talentsourcingsystem.repository.abstracts;

import com.dgnklz.talentsourcingsystem.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}
