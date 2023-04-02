package com.dgnklz.talentsourcingsystem.business.dto.responses.candidate;

import com.dgnklz.talentsourcingsystem.entities.constants.PreviousInteraction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCandidateResponse {
    private int id;
    private String nameSurname;
    private String contactInformation;
    private int candidateStatusId;
}
