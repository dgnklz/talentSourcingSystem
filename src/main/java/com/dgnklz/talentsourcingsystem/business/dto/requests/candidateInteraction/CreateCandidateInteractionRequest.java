package com.dgnklz.talentsourcingsystem.business.dto.requests.candidateInteraction;

import com.dgnklz.talentsourcingsystem.business.constants.ValidationMessages;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCandidateInteractionRequest {
    @NotNull
    @Min(value = 1, message = ValidationMessages.CandidateInteraction.TypeValue)
    @Max(value = 2, message = ValidationMessages.CandidateInteraction.TypeValue)
    private int interactionType;

    @NotNull
    @Size(min = 1, max = 50, message = ValidationMessages.CandidateInteraction.ContentSize)
    private String content;

    @NotNull
    @NotBlank
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @JsonFormat(pattern = "dd-mm-yyyy")
    private Date date;

    @NotNull
    @Pattern(regexp = "^(true|false)$", message = ValidationMessages.CandidateInteraction.Responded)
    private boolean candidateResponded;

    @NotNull
    @NotBlank
    @Min(value = 1, message = ValidationMessages.CandidateInteraction.CandidateIdValueSize)
    private int candidateId;
}
