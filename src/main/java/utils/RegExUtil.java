package utils;

import DTOs.CurrencyDto;
import DTOs.ExpressionDto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static utils.RegExConstant.CURRENCY;
import static utils.RegExConstant.REGEX;

/** @author Daniel Polo 2022 **/
public class RegExUtil {
    public ExpressionDto parseToDto(String args) {
        ExpressionDto expressionDto = new ExpressionDto();
        Pattern argsPattern = Pattern.compile(REGEX);
        Matcher argsMatcher = argsPattern.matcher(args);
        return getExpressionIfMatched(expressionDto, argsMatcher);
    }

    private static ExpressionDto getExpressionIfMatched(ExpressionDto expressionDto, Matcher argsMatcher) {
        if (argsMatcher.matches()) {
            CurrencyDto currencyA = parseInputToCurrencyDto(argsMatcher.group(1));

            if (argsMatcher.group(3).equals("+") || argsMatcher.group(3).equals("-")) {
                CurrencyDto currencyB = parseInputToCurrencyDto(argsMatcher.group(5));
                expressionDto = setExpression(currencyA, argsMatcher.group(3).charAt(0), currencyB);
            }

            if (argsMatcher.group(3).equals("*") || argsMatcher.group(3).equals("/")) {
                expressionDto = setExpression(currencyA, argsMatcher.group(3).charAt(0), Integer.parseInt(argsMatcher.group(6)));
            }
        }
        return expressionDto;
    }

    private static CurrencyDto parseInputToCurrencyDto(String args) {
        CurrencyDto currency = new CurrencyDto();
        Pattern currencyPattern = Pattern.compile(CURRENCY);
        Matcher currencyMatcher = currencyPattern.matcher(args);

        if (currencyMatcher.matches()) {
            currency = CurrencyDto.builder()
                    .pound(Integer.parseInt(currencyMatcher.group(1)))
                    .shilling(Integer.parseInt(currencyMatcher.group(2)))
                    .penny(Integer.parseInt(currencyMatcher.group(3)))
                    .build();
        }
        return currency;
    }

    private static ExpressionDto setExpression(CurrencyDto currencyA, Character operator, CurrencyDto currencyB) {
        return ExpressionDto.builder()
                .currencyA(currencyA)
                .operator(operator)
                .currencyB(currencyB)
                .build();
    }

    private static ExpressionDto setExpression(CurrencyDto currencyA, Character operator, Integer value) {
        return ExpressionDto.builder()
                .currencyA(currencyA)
                .operator(operator)
                .value(value)
                .build();
    }
}
