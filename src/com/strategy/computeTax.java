package com.strategy;

import java.math.BigDecimal;

public interface computeTax {
	
	public BigDecimal compute(BigDecimal income, BigDecimal rate);

}
