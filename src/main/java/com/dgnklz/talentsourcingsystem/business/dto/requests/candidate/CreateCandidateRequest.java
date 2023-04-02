package com.dgnklz.talentsourcingsystem.business.dto.requests.candidate;

import com.dgnklz.talentsourcingsystem.business.constants.ValidationMessages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCandidateRequest {
    @NotNull
    @Size(min = 3 ,max = 20, message = ValidationMessages.Candidate.NameSize)
    private String nameSurname;

    @NotNull
    @Size(min = 1, max = 50, message = ValidationMessages.Candidate.ContactInformationSize)
    private String contactInformation;

    @NotNull
    @Min(value = 1, message = ValidationMessages.Candidate.StatusIdValue)
    @Max(value = 4, message = ValidationMessages.Candidate.StatusIdValue)
    private int candidateStatusId;
}