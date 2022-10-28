package services.impls.arithmeticOperations;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;
import services.SubtractionSumService;
import static services.impls.currencies.PennyServiceImpl.*;

public class SubtractionServiceImpl implements SubtractionSumService {
    @Override
    public CurrencyDto calculate(ExpressionDto expressionDto) {
        int penny = expressionDto.getCurrencyA().getPenny() - expressionDto.getCurrencyB().getPenny();
        int shilling = expressionDto.getCurrencyA().getShilling() - expressionDto.getCurrencyB().getShilling();
        int pound = expressionDto.getCurrencyA().getPound() - expressionDto.getCurrencyB().getPound();

        penny += convertPoundAndShillingIntoPenny(pound, shilling);

        return convertPennyIntoPoundAndShilling(pound, shilling, penny);
    }
}