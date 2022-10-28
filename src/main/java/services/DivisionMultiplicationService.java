package services;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;

public interface DivisionMultiplicationService {
    CurrencyDto calculate(ExpressionDto expressionDto);
}