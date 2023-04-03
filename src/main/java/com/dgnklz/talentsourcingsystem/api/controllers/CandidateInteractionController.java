package com.dgnklz.talentsourcingsystem.api.controllers;

import com.dgnklz.talentsourcingsystem.business.abstracts.CandidateInteractionService;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.GetAllCandidateInteractionsResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.GetCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.core.results.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/candidateInteractions")
public class CandidateInteractionController {
    private CandidateInteractionService service;

    @GetMapping
    public DataResult<List<GetAllCandidateInteractionsResponse>> getAll() {
        return service.getAll();
    }
}
