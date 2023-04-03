package com.dgnklz.talentsourcingsystem.api.controllers;

import com.dgnklz.talentsourcingsystem.business.abstracts.CandidateInteractionService;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.UpdateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidateInteraction.CreateCandidateInteractionRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidateInteraction.UpdateCandidateInteractionRequest;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.CreateCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.GetAllCandidateInteractionsResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.GetCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.UpdateCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.core.results.DataResult;
import com.dgnklz.talentsourcingsystem.core.results.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/{id}")
    public DataResult<GetCandidateInteractionResponse> getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public DataResult<CreateCandidateInteractionResponse> create(@Valid @RequestBody CreateCandidateInteractionRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public DataResult<UpdateCandidateInteractionResponse> update(@Valid @RequestBody UpdateCandidateInteractionRequest request, @PathVariable int id) {
        return service.update(request, id);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id) {
        return service.delete(id);
    }
}
