package services;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;

/** @author Daniel Polo 2022 **/
public interface SubtractionSumService {
    CurrencyDto calculate(ExpressionDto expressionDto);
}