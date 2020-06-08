package com.Fundnesia.service;

import java.math.BigDecimal;

import com.Fundnesia.model.Loan;

public interface LoanService {
	public Loan calculate(int tenure, BigDecimal ticketSize);
}
