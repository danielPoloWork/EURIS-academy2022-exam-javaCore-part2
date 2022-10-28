package services;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;

public interface SubtractionSumService {
    CurrencyDto calculate(ExpressionDto expressionDto);
}