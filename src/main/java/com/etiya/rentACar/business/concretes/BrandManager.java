package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.BrandService;
import com.etiya.rentACar.business.dtos.requests.CreateBrandRequest;
import com.etiya.rentACar.business.dtos.responses.brands.CreatedBrandResponse;
import com.etiya.rentACar.business.dtos.responses.brands.GetListBrandResponse;
import com.etiya.rentACar.core.exceptions.types.BusinessException;
import com.etiya.rentACar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentACar.dataAccess.abstracts.BrandRepository;
import com.etiya.rentACar.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public CreatedBrandResponse add(CreateBrandRequest createBrandRequest) {
        //todo : Business rules
         checkIfBrandNameExists(createBrandRequest.getName());
        //mapping
//        Brand brand = new Brand();
//        brand.setName(createBrandRequest.getName());
//        brand.setCreatedDate(LocalDateTime.now());

        Brand mappedBrand = modelMapperService.forRequest().
                map(createBrandRequest,Brand.class);
        Brand createdBrand =   this.brandRepository.save(mappedBrand);

//        //mapping
//        CreatedBrandResponse createdBrandResponse = new CreatedBrandResponse();
//        createdBrandResponse.setId(createdBrand.getId());
//        createdBrandResponse.setName(createdBrand.getName());
//        createdBrandResponse.setCreatedDate(createdBrand.getCreatedDate());

        CreatedBrandResponse createdBrandResponse = modelMapperService.forResponse()
                .map(createdBrand,CreatedBrandResponse.class);

        return createdBrandResponse;
    }

    @Override
    public List<GetListBrandResponse> getList() {
        List<Brand> brands = brandRepository.findAll();
        List<GetListBrandResponse> getListBrandResponses = new ArrayList<>();
        for(Brand brand:brands){
            GetListBrandResponse response = new GetListBrandResponse();
            response.setId(brand.getId());
            response.setName(brand.getName());
            getListBrandResponses.add(response);
        }
        return  getListBrandResponses;
    }

    @Override
    public List<GetListBrandResponse> getByName(String name) {
        List<Brand> brands = brandRepository.findByName(name);
        List<GetListBrandResponse> getListBrandResponses = new ArrayList<>();
        for(Brand brand:brands){
            GetListBrandResponse response = new GetListBrandResponse();
            response.setId(brand.getId());
            response.setName(brand.getName());
            getListBrandResponses.add(response);
        }
        return  getListBrandResponses;
    }

    private void checkIfBrandNameExists(String name){

        Brand brand = brandRepository.findByNameIgnoreCase(name.trim());
        //audi,mercedes "audi"
        if(brand!=null){
            throw new BusinessException("Böyle bir marka daha önce eklendi");
        }
    }

}


//Tüm entityler için Add,Update,Delete, GetAll,GetById operasyonlarını uçtan uca yazınız.
//tamamında response-request pattern uygulanmalı

//@Service, @Component, @Bean, @Repository anotasyonlarını detaylı araştırınız.IoC