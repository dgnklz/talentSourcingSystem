package com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCandidateInteractionsResponse {
    private int id;
    private int interactionTypeId;
    private String content;
    private Date date;
    private boolean candidateResponded;
}
