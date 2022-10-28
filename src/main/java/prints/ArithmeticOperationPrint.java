package prints;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;
import static services.impls.currencies.PennyServiceImpl.*;

/** @author Daniel Polo 2022 **/
public class ArithmeticOperationPrint {

    public void printSubtractionSumResult(ExpressionDto expressionDto, CurrencyDto currencyDto) {
        String result = "%sp %ss %sd\n";
        String negativeResult = "(%sp %ss %sd)\n";

        if (currencyDto.getPound() < 0 || currencyDto.getShilling() < 0 || currencyDto.getPenny() < 0) {
            result = negativeResult;
        }

        System.out.printf("%sp %ss %sd %s %sp %ss %sd = " + result,
                expressionDto.getCurrencyA().getPound(),
                expressionDto.getCurrencyA().getShilling(),
                expressionDto.getCurrencyA().getPenny(),
                expressionDto.getOperator(),
                expressionDto.getCurrencyB().getPound(),
                expressionDto.getCurrencyB().getShilling(),
                expressionDto.getCurrencyB().getPenny(),
                currencyDto.getPound(),
                currencyDto.getShilling(),
                currencyDto.getPenny());
    }

    public void printDivisionMultiplicationResult(ExpressionDto expressionDto, CurrencyDto currencyDto) {
        String result = "%sp %ss %sd";
        String restResult = " (%sp %ss %sd)";

        CurrencyDto rest;
        if (expressionDto.getOperator().equals('/') && currencyDto.getRest() > 0 ) {
            int pound = 0;
            int shilling = 0;
            rest = convertPennyIntoPoundAndShilling(pound, shilling, currencyDto.getRest());
            result = result + String.format(restResult,
                    rest.getPound(),
                    rest.getShilling(),
                    rest.getPenny());
        }
        System.out.printf("%sp %ss %sd %s %s = " + result + "\n",
                expressionDto.getCurrencyA().getPound(),
                expressionDto.getCurrencyA().getShilling(),
                expressionDto.getCurrencyA().getPenny(),
                expressionDto.getOperator(),
                expressionDto.getValue(),
                currencyDto.getPound(),
                currencyDto.getShilling(),
                currencyDto.getPenny());
    }
}