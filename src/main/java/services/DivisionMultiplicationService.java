package services;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;

/** @author Daniel Polo 2022 **/
public interface DivisionMultiplicationService {
    CurrencyDto calculate(ExpressionDto expressionDto);
}