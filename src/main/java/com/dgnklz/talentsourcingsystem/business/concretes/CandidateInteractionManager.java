package com.dgnklz.talentsourcingsystem.business.concretes;

import com.dgnklz.talentsourcingsystem.business.abstracts.CandidateInteractionService;
import com.dgnklz.talentsourcingsystem.business.constants.Messages;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidateInteraction.CreateCandidateInteractionRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidateInteraction.UpdateCandidateInteractionRequest;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.CreateCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.GetAllCandidateInteractionsResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.GetCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidateInteraction.UpdateCandidateInteractionResponse;
import com.dgnklz.talentsourcingsystem.core.exceptions.BusinessException;
import com.dgnklz.talentsourcingsystem.core.mapping.ModelMapperService;
import com.dgnklz.talentsourcingsystem.core.results.DataResult;
import com.dgnklz.talentsourcingsystem.core.results.Result;
import com.dgnklz.talentsourcingsystem.core.results.SuccessDataResult;
import com.dgnklz.talentsourcingsystem.entities.Candidate;
import com.dgnklz.talentsourcingsystem.entities.CandidateInteraction;
import com.dgnklz.talentsourcingsystem.repository.abstracts.CandidateInteractionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CandidateInteractionManager implements CandidateInteractionService {
    private ModelMapperService mapper;
    private CandidateInteractionRepository repository;


    @Override
    public DataResult<List<GetAllCandidateInteractionsResponse>> getAll() {
        List<CandidateInteraction> candidateInteractions = repository.findAll();
        List<GetAllCandidateInteractionsResponse> responses = candidateInteractions
                .stream()
                    .map(candidateInteraction -> mapper.forResponse().map(candidateInteraction, GetAllCandidateInteractionsResponse.class))
                        .toList();
        return new SuccessDataResult<>(responses, Messages.CandidateInteraction.AllListed);
    }

    @Override
    public DataResult<GetCandidateInteractionResponse> getById(int id) {
        checkIfCandidateInteractionExistById(id);
        CandidateInteraction candidateInteraction = repository.findById(id).orElseThrow();
        GetCandidateInteractionResponse response = mapper.forResponse().map(candidateInteraction, GetCandidateInteractionResponse.class);
        return new SuccessDataResult<>(response, Messages.CandidateInteraction.ListedById);
    }

    @Override
    public DataResult<CreateCandidateInteractionResponse> create(CreateCandidateInteractionRequest request) {
        return null;
    }

    @Override
    public DataResult<UpdateCandidateInteractionResponse> update(UpdateCandidateInteractionRequest request, int id) {
        return null;
    }

    @Override
    public Result delete(int id) {
        return null;
    }

    /// DOMAIN RULES \\\

    private void checkIfCandidateInteractionExistById(int id) {
        if(!repository.existsById(id)) {
            throw new BusinessException(Messages.CandidateInteraction.NotExist);
        }
    }
}
