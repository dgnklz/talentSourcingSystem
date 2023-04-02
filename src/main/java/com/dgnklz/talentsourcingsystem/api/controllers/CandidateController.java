package com.dgnklz.talentsourcingsystem.api.controllers;

import com.dgnklz.talentsourcingsystem.business.abstracts.CandidateService;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetAllCandidatesResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetCandidateResponse;
import com.dgnklz.talentsourcingsystem.core.results.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/candidates")
public class CandidateController {
    private CandidateService service;

    @GetMapping
    public DataResult<List<GetAllCandidatesResponse>> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public DataResult<GetCandidateResponse> getById(@PathVariable int id) {
        return service.getById(id);
    }

}
