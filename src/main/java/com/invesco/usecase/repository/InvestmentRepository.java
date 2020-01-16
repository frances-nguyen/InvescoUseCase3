package com.invesco.usecase.repository;

import com.invesco.usecase.domain.Investment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends CrudRepository<Investment, Long> {

    Investment findByInvestmentIdentifier(long investmentIdentifier);
}
