package com.example.pagination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pagination.FundService;
import com.example.pagination.model.Fund;

@RestController
@RequestMapping("/api")
public class FundController {
    @Autowired
    private FundService fundService;

    @GetMapping("/funds")
    public ResponseEntity<Page<Fund>> getAllFunds(@RequestParam(defaultValue = "0") int pageNo,
    @RequestParam(defaultValue = "10") int pageSize,
    @RequestParam(defaultValue = "title") String sortBy)
    {
        Page<Fund> fund = fundService.getAllFund(pageNo,pageSize,sortBy);
        return ResponseEntity.ok(fund);
    }
}

