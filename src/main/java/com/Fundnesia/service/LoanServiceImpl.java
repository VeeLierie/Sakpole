package com.Fundnesia.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.Fundnesia.model.Loan;

@Service
public class LoanServiceImpl implements LoanService{

	@Override
	public Loan calculate(int tenure, BigDecimal ticketSize) {

		Loan tenor = new Loan();
		tenor.setTenure(tenure);
		tenor.setTicketSize(ticketSize);
		
		BigDecimal fee = BigDecimal.valueOf(0.002*Long.valueOf(tenure)*ticketSize.longValue()) ;
		tenor.setFee(fee);
		
		BigDecimal totaloan = ticketSize.add(fee);
		tenor.setTotaLoan(totaloan);
		
		BigDecimal permonth = totaloan.divide(BigDecimal.valueOf(tenure));	
		tenor.setInstallmentPerMonth(permonth);

		tenor.setStatus("SUBMITTED");
		
		return tenor;
	}
}
