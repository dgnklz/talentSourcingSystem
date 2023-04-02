package com.dgnklz.talentsourcingsystem.business.concretes;

import com.dgnklz.talentsourcingsystem.business.abstracts.CandidateService;
import com.dgnklz.talentsourcingsystem.business.constants.Messages;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.CreateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.requests.candidate.UpdateCandidateRequest;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.CreateCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetAllCandidatesResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.GetCandidateResponse;
import com.dgnklz.talentsourcingsystem.business.dto.responses.candidate.UpdateCandidateResponse;
import com.dgnklz.talentsourcingsystem.core.exceptions.BusinessException;
import com.dgnklz.talentsourcingsystem.core.mapping.ModelMapperService;
import com.dgnklz.talentsourcingsystem.core.results.DataResult;
import com.dgnklz.talentsourcingsystem.core.results.Result;
import com.dgnklz.talentsourcingsystem.core.results.SuccessDataResult;
import com.dgnklz.talentsourcingsystem.core.results.SuccessResult;
import com.dgnklz.talentsourcingsystem.entities.Candidate;
import com.dgnklz.talentsourcingsystem.repository.abstracts.CandidateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CandidateManager implements CandidateService {
    private ModelMapperService mapper;
    private CandidateRepository repository;

    @Override
    public DataResult<List<GetAllCandidatesResponse>> getAll() {
        List<Candidate> candidates = repository.findAll();
        List<GetAllCandidatesResponse> responses = candidates
                .stream()
                    .map(candidate -> mapper.forResponse().map(candidate, GetAllCandidatesResponse.class))
                        .toList();
        return new SuccessDataResult<>(responses, Messages.Candidate.AllListed);
    }

    @Override
    public DataResult<GetCandidateResponse> getById(int id) {
        checkIfCandidateExistById(id);
        Candidate candidate = repository.findById(id).orElseThrow();
        GetCandidateResponse response = mapper.forResponse().map(candidate, GetCandidateResponse.class);
        return new SuccessDataResult<>(response, Messages.Candidate.ListedById);
    }

    @Override
    public DataResult<CreateCandidateResponse> create(CreateCandidateRequest request) {
        Candidate candidate = mapper.forRequest().map(request, Candidate.class);
        repository.save(candidate);
        CreateCandidateResponse response = mapper.forResponse().map(candidate, CreateCandidateResponse.class);
        return new SuccessDataResult<>(response, Messages.Candidate.Created);
    }

    @Override
    public DataResult<UpdateCandidateResponse> update(UpdateCandidateRequest request, int id) {
        checkIfCandidateExistById(id);
        Candidate candidate = mapper.forRequest().map(request, Candidate.class);
        candidate.setId(id);
        repository.save(candidate);
        UpdateCandidateResponse response = mapper.forResponse().map(candidate, UpdateCandidateResponse.class);
        return new SuccessDataResult<>(response,Messages.Candidate.Updated);
    }

    @Override
    public Result delete(int id) {
        checkIfCandidateExistById(id);
        repository.deleteById(id);
        return new SuccessResult(Messages.Candidate.Deleted);
    }

    /// DOMAIN RULES \\\

    private void checkIfCandidateExistById(int id) {
        if(!repository.existsById(id)) {
            throw new BusinessException(Messages.Candidate.NotExist);
        }
    }
}
