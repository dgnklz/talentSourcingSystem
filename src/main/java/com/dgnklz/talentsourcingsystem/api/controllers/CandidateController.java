package com.dgnklz.talentsourcingsystem.api.controllers;

import com.dgnklz.talentsourcingsystem.business.abstracts.CandidateService;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.CreateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.UpdateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.CreateCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetAllCandidatesResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.UpdateCandidateResponse;
import com.dgnklz.talentsourcingsystem.core.results.DataResult;
import com.dgnklz.talentsourcingsystem.core.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public DataResult<CreateCandidateResponse> create(@Valid @RequestBody CreateCandidateRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public DataResult<UpdateCandidateResponse> update(@Valid @RequestBody UpdateCandidateRequest request, @PathVariable int id) {
        return service.update(request, id);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id) {
        return service.delete(id);
    }

}
