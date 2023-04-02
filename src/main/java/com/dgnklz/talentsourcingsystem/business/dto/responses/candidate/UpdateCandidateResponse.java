package com.dgnklz.talentsourcingsystem.business.dto.responses.candidate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCandidateResponse {
    private int id;
    private String nameSurname;
    private String contactInformation;
    private int previousInteractionId;
    private int candidateStatusId;
}
