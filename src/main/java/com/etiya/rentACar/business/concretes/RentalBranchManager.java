package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.RentalBranchService;
import com.etiya.rentACar.business.dtos.requests.rentalbranches.CreateRentalBranchRequest;
import com.etiya.rentACar.business.dtos.responses.rentalbranches.CreatedRentalBranchResponse;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.RentalBranchRepository;
import com.etiya.rentACar.entities.RentalBranch;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class RentalBranchManager implements RentalBranchService {

    private RentalBranchRepository rentalBranchRepository;
    private ModelMapperService modelMapperService;

    @Override
    public CreatedRentalBranchResponse add(CreateRentalBranchRequest createRentalBranchRequest) {
        RentalBranch mappedRentalBranch = modelMapperService.
                forRequest().map(createRentalBranchRequest,RentalBranch.class);
        RentalBranch createdRentalBranch = rentalBranchRepository.save(mappedRentalBranch);
        CreatedRentalBranchResponse response = modelMapperService.forResponse()
                .map(createdRentalBranch,CreatedRentalBranchResponse.class);
        return response;
    }
}
