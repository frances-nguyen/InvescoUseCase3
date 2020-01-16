package com.invesco.usecase.service;

import com.invesco.usecase.domain.Investment;
import com.invesco.usecase.repository.InvestmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {

    private final InvestmentRepository investmentRepository;

    public InvestmentService(InvestmentRepository investmentRepository) {
        this.investmentRepository = investmentRepository;
    }

    public Iterable<Investment> saveInvestments(List<Investment> investmentList) {
        Iterable<Investment> allInvestmentsList = investmentRepository.saveAll(investmentList);
        return allInvestmentsList;
    }

    public Investment findInvestment(Long investmentId){
        Investment  investment = investmentRepository.findByInvestmentIdentifier(investmentId);
        return investment;
    }

    public Iterable<Investment> findAllInvestments(){
        return investmentRepository.findAll();
    }
}
