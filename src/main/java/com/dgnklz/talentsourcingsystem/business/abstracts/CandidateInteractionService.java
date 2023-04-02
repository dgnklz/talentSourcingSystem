package com.dgnklz.talentsourcingsystem.business.abstracts;

import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.CreateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.UpdateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidateInteraction.CreateCandidateInteractionRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidateInteraction.UpdateCandidateInteractionRequest;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.CreateCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetAllCandidatesResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.UpdateCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.CreateCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.GetAllCandidateInteractionsResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.GetCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.UpdateCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.core.results.DataResult;
import com.dgnklz.talentsourcingsystem.core.results.Result;

import java.util.List;

public interface CandidateInteractionService {
    DataResult<List<GetAllCandidateInteractionsResponse>> getAll();
    DataResult<GetCandidateInteractionResponse> getById(int id);
    DataResult<CreateCandidateInteractionResponse> create(CreateCandidateInteractionRequest request);
    DataResult<UpdateCandidateInteractionResponse> update(UpdateCandidateInteractionRequest request, int id);
    Result delete(int id);
}