package services.impls.currencies;

import DTOs.CurrencyDto;
import services.CurrencyService;
import utils.enums.PennyConversionRate;
import static services.impls.currencies.PoundServiceImpl.*;
import static services.impls.currencies.ShillingServiceImpl.*;

/** @author Daniel Polo 2022 **/
public class PennyServiceImpl implements CurrencyService {
    @Override
    public Integer conversion(CurrencyDto currencyDto) {
        return (currencyDto.getPound() * PennyConversionRate.POUND.getRate())
                + (currencyDto.getShilling() * PennyConversionRate.SHILLING.getRate())
                + (currencyDto.getPenny());
    }

    public static Integer convertPoundAndShillingIntoPenny(Integer pound, Integer shilling) {
        return (pound * PennyConversionRate.POUND.getRate())
                + (shilling * PennyConversionRate.SHILLING.getRate());
    }

    public static CurrencyDto convertPennyIntoPoundAndShilling(Integer pound, Integer shilling, Integer penny) {
        pound = convertPennyIntoPound(penny);
        penny -= subtractConvertedPound(penny);

        shilling = convertPennyIntoShilling(penny);
        penny -= subtractConvertedShilling(penny);

        return CurrencyDto.builder()
                .pound(pound)
                .shilling(shilling)
                .penny(penny)
                .build();
    }

    public static CurrencyDto convertPennyIntoPoundAndShilling(Integer pound, Integer shilling, Integer penny, Integer rest) {
        pound = convertPennyIntoPound(penny);
        penny -= subtractConvertedPound(penny);

        shilling = convertPennyIntoShilling(penny);
        penny -= subtractConvertedShilling(penny);

        return CurrencyDto.builder()
                .pound(pound)
                .shilling(shilling)
                .penny(penny)
                .rest(rest)
                .build();
    }
}