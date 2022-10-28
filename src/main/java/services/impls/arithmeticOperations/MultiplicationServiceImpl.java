package services.impls.arithmeticOperations;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;
import services.DivisionMultiplicationService;
import static services.impls.currencies.PennyServiceImpl.*;

/** @author Daniel Polo 2022 **/
public class MultiplicationServiceImpl implements DivisionMultiplicationService {
    @Override
    public CurrencyDto calculate(ExpressionDto expressionDto) {
        int penny = expressionDto.getCurrencyA().getPenny();
        int shilling = expressionDto.getCurrencyA().getShilling();
        int pound = expressionDto.getCurrencyA().getPound();

        penny += convertPoundAndShillingIntoPenny(pound, shilling);
        penny = penny * expressionDto.getValue();

        return convertPennyIntoPoundAndShilling(pound, shilling, penny);
    }
}
