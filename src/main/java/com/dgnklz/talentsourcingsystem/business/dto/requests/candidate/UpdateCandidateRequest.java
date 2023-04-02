package com.dgnklz.talentsourcingsystem.business.dto.requests.candidate;

import com.dgnklz.talentsourcingsystem.business.constants.ValidationMessages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCandidateRequest {
    @NotNull
    @Size(min = 3 ,max = 20, message = ValidationMessages.Candidate.NameSize)
    private String nameSurname;

    @NotNull
    @Size(min = 1, max = 50, message = ValidationMessages.Candidate.ContactInformationSize)
    private String contactInformation;

    @NotNull
    @Min(value = 1,message = ValidationMessages.Candidate.PreviousInteractionIdValue)
    @Max(value = 2, message = ValidationMessages.Candidate.PreviousInteractionIdValue)
    private int previousInteractionId;

    @NotNull
    @Min(value = 1, message = ValidationMessages.Candidate.StatusIdValue)
    @Max(value = 4, message = ValidationMessages.Candidate.StatusIdValue)
    private int candidateStatusId;
}