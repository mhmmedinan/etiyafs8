package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.CreateBrandRequest;
import com.etiya.rentACar.business.dtos.responses.brands.CreatedBrandResponse;
import com.etiya.rentACar.business.dtos.responses.brands.GetListBrandResponse;

import java.util.List;

public interface BrandService {
    CreatedBrandResponse add(CreateBrandRequest brand);
    List<GetListBrandResponse> getList();

    List<GetListBrandResponse> getByName(String name);
}
