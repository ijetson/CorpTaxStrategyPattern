package com.strategy.impl;

import java.math.BigDecimal;

import com.strategy.computeTax;

public class PhCorporateTax implements computeTax{

	@Override
	public BigDecimal compute(BigDecimal profit, BigDecimal rate) {
		return profit.multiply(rate);
	}

}
