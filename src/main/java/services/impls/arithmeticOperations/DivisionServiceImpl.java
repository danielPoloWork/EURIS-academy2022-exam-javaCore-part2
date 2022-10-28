package services.impls.arithmeticOperations;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;
import services.DivisionMultiplicationService;

import static services.impls.currencies.PennyServiceImpl.convertPennyIntoPoundAndShilling;
import static services.impls.currencies.PennyServiceImpl.convertPoundAndShillingIntoPenny;

public class DivisionServiceImpl implements DivisionMultiplicationService {
    @Override
    public CurrencyDto calculate(ExpressionDto expressionDto) {
        int penny = expressionDto.getCurrencyA().getPenny();
        int shilling = expressionDto.getCurrencyA().getShilling();
        int pound = expressionDto.getCurrencyA().getPound();

        penny += convertPoundAndShillingIntoPenny(pound, shilling);
        double pennyWithRest = (double) penny / expressionDto.getValue();
        int rest = (int) ((pennyWithRest - (int) pennyWithRest) * expressionDto.getValue());
        penny = (int) pennyWithRest;

        return convertPennyIntoPoundAndShilling(pound, shilling, penny, rest);
    }
}
