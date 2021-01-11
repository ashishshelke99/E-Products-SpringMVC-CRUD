package com.eproducts.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalFormatter {

	public static BigDecimal myDecimalFormat(BigDecimal number)
	{
		return number.setScale(6, RoundingMode.HALF_UP);
	}
	
}
