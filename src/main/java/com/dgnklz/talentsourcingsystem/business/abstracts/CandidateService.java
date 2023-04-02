package com.dgnklz.talentsourcingsystem.business.abstracts;

import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.CreateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.UpdateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.CreateCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetAllCandidatesResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.UpdateCandidateResponse;
import com.dgnklz.talentsourcingsystem.core.results.DataResult;
import com.dgnklz.talentsourcingsystem.core.results.Result;

import java.util.List;

public interface CandidateService {
    DataResult<List<GetAllCandidatesResponse>> getAll();
    DataResult<GetCandidateResponse> getById(int id);
    DataResult<CreateCandidateResponse> create(CreateCandidateRequest request);
    DataResult<UpdateCandidateResponse> update(UpdateCandidateRequest request, int id);
    Result delete(int id);
}