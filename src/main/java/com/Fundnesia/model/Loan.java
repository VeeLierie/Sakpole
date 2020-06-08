package com.Fundnesia.model;

import java.math.BigDecimal;

public class Loan {
    private int tenure;
    private BigDecimal ticketSize;
    private BigDecimal fee;
    private BigDecimal totaLoan;
    private BigDecimal installmentPerMonth;
    private String status;
    
    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public BigDecimal getTicketSize() {
        return ticketSize;
    }

    public void setTicketSize(BigDecimal ticketSize) {
        this.ticketSize = ticketSize;
    }

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getTotaLoan() {
		return totaLoan;
	}

	public void setTotaLoan(BigDecimal totaLoan) {
		this.totaLoan = totaLoan;
	}

	public BigDecimal getInstallmentPerMonth() {
		return installmentPerMonth;
	}

	public void setInstallmentPerMonth(BigDecimal installmentPerMonth) {
		this.installmentPerMonth = installmentPerMonth;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}
