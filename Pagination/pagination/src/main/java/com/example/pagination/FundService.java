package com.example.pagination;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.pagination.model.Fund;
import com.example.pagination.repository.FundRepo;

@Service
public class FundService {
    @Autowired
    private FundRepo fundRepo;
   public Page<Fund> getAllFund(int pageNo,int pageSize , String sortBy){

    PageRequest pageable = PageRequest.of(pageNo , pageSize, Sort.by(sortBy));
    return fundRepo.findAll(pageable);
   }
}
